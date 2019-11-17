package com.company.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Jdbc_06_数据库连接池_druid {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet ret = null;

        try {
            // 获取数据库连接
            conn = JDBCDruidUtils.getConnection();
            // 编写sql
            String sql = "select * from user where username = ?;";
            // 获取执行 sql 对象
            pstat = conn.prepareStatement(sql);
            // 给 sql 赋值
            pstat.setString(1, "xiaoming");
            // 执行sql
            ret = pstat.executeQuery();
            // 读取一条记录
            ret.next();
            // 处理结果 ResultSet
            String passwd = ret.getString("passwd");
            System.out.println(passwd);  // 123

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCDruidUtils.close(ret, pstat, conn);
        }
    }
}
