package com.company.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC 初步使用
 */
public class Jdbc_01_ConnectDataBase {
    public static void main(String[] args) throws Exception {
        // 导入 mysql jar 包, 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库连接对象, 获取 cursor
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.115/JDBC", "chenkai", "chenkai");
        Statement st = conn.createStatement();
        // 写 sql
        String sql = "create table student(id int unsigned primary key auto_increment not null, name varchar(150))";
        // 执行 sql
        int num = st.executeUpdate(sql);
        // 处理结果
        System.out.println(num);
        // 释放资源
        st.close();
        conn.close();
    }
}
