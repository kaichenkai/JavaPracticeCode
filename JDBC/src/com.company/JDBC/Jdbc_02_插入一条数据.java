package com.company.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * 使用 JDBC 插入一条数据
 */
public class Jdbc_02_插入一条数据 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet ret = null;
        try {
            // 1.注册驱动
//            Class.forName("com.mysql.jdbc.Driver");
            // 3.获取数据库连接
//            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.115:3306/JDBC", "chenkai", "chenkai");
            // 2.编写sql
            conn = JDBCUtils.getConnection();
            String sql = "select * from student";
            // 4.获取statement操作对象
            st = conn.createStatement();
            // 5.执行sql
            ret = st.executeQuery(sql);
            // 6.处理sql执行结果
            ret.next();
            int id = ret.getInt(1);
            String name = ret.getString("name");
            System.out.println(String.format("id: %s， name: %s", id, name));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
//            try {
//                ret.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//            try {
//                st.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }

            JDBCUtils.close(ret, st, conn);
        }
    }
}
