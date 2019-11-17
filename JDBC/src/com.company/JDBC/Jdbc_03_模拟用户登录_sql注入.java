package com.company.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 模拟用户登录, 处理sql注入问题
 */
public class Jdbc_03_模拟用户登录_sql注入 {
    public Connection conn = null;
    public PreparedStatement pstat = null;
    public ResultSet ret = null;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = sc.nextLine();
        System.out.print("请输入密码:");
        String passwd = sc.nextLine();

        boolean ret = new Jdbc_03_模拟用户登录_sql注入().login(username, passwd);
        if (ret) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码输入错误!");
        }
    }

    public boolean login(String username, String passwd){
        if (username == null | passwd == null) {
            return false;
        }

        try{
            // 通过 JDBCUtils 获取数据库连接
            conn = JDBCUtils.getConnection();
            // 拼写sql
            String sql = "select * from user where username = ? and passwd = ?";
            // 获取 PreparedStatement 对象
            pstat = conn.prepareStatement(sql);
            // 给 sql 赋值
            pstat.setString(1, username);
            pstat.setString(2, passwd);
            // 执行 sql
            ret = pstat.executeQuery();
            // 处理结果
            return ret.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(ret, pstat, conn);
        }
        return false;
    }
}
