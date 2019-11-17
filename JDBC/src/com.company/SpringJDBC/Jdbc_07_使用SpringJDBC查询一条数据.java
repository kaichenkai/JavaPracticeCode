package com.company.SpringJDBC;

import com.company.JDBC.JDBCDruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

/**
 * 使用 Spring JDBC 查询一条数据, 封装到不同的对象.
 */
public class Jdbc_07_使用SpringJDBC查询一条数据 {
    // 获取 JdbcTemplate 对象
    private JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());

    public static void main(String[] args) {
        Jdbc_07_使用SpringJDBC查询一条数据 obj = new Jdbc_07_使用SpringJDBC查询一条数据();
        // 更新一条记录
        obj.updateRecord();
        // 查询结果 Map
        obj.queryDataByMap();
        // 查询结果 List
        obj.queryDataByList();
        // 查询结果 Object  (常用!)
        obj.queryDataByObject();
        // 查询结果 返回基本数据类型, 聚合函数
        obj.queryDataByBasic();
    }

    // 更新一条数据
    public void updateRecord(){
        String updateSql = "update user set balance = 123456 where id = ?";
        int count = this.template.update(updateSql, 1);
        System.out.println("受影响的行数是: " + count);
    }

    // 查询结果, 将结果集封装为 map 集合
    public void queryDataByMap(){
        // 拼写 sql
        String querySql = "select * from user where id = ?";
        Map<String, Object> map = this.template.queryForMap(querySql, 1);
        System.out.println(map);
    }

    // 查询结果, 将结果集封装为 List 集合
    public void queryDataByList(){
        String querySql = "select * from user limit 0, 3";
        List<Map<String, Object>> list = this.template.queryForList(querySql);
        for (Map row:list) {
            System.out.println(row);
            System.out.println(row.get("username"));
        }
    }

    // 查询结果, 将结果集封装为 JavaBean 对象 (放在java实例属性值)
    public void queryDataByObject(){
        String querySql = "select * from user limit 0, 3";
        List<UserModule> objList = this.template.query(querySql, new BeanPropertyRowMapper<UserModule>(UserModule.class));
        for (UserModule user:objList) {
            System.out.println(user);
            System.out.println(user.getBalance());
        }
    }

    // 查询结果, 返回基本数据类型, 多用于 聚合函数
    public void queryDataByBasic(){
        String querySql = "select sum(balance) from user";
        Integer balanceTotal = this.template.queryForObject(querySql, Integer.class);
        System.out.println(balanceTotal);  // 125456
    }
}