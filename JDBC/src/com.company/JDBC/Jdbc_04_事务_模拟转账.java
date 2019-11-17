package com.company.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  JDBC 事务的应用, 模拟转账
 */
public class Jdbc_04_事务_模拟转账 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstat1 = null;
        PreparedStatement pstat2 = null;

        try {
            // 获取数据库连接
            conn = JDBCUtils.getConnection();
            // 开启事务!!!
            conn.setAutoCommit(false);
            // 编写sql
            String sql1 = "update user set balance = balance - 500 where username = ?";
            String sql2 = "update user set balance = balance + 500 where username = ?";
            // 获取 preparedStatement 对象
            pstat1 = conn.prepareStatement(sql1);
            pstat2 = conn.prepareStatement(sql2);
            // 给 sql 赋值
            pstat1.setString(1, "xiaoming");
            pstat2.setString(1, "xiaohong");
            // 执行sql
            pstat1.executeUpdate();
            pstat2.executeUpdate();

            //手动抛出异常
            int a = 3 / 0;

            // 提交事务
            conn.commit();
            System.out.println("处理完成");
        } catch (Exception e) {
            e.printStackTrace();
            // 回滚事务, 数据库连接不为空的时候进行回滚  (不会滚也不会更新成功, 回滚是不是在释放资源 ?)
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            // 释放资源
            JDBCUtils.close(pstat1, conn);
            JDBCUtils.close(pstat2, null);
        }
    }
}
