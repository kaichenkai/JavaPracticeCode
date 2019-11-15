package com.company.JDBC;

import java.sql.*;
import java.util.Properties;
import java.io.IOException;
import java.io.FileReader;
import java.net.URL;


/**
 * 封装 JDBC 的工具类
 */
public class JDBCUtils {
    private static String ipaddr;
    private static String port;
    private static String dbname;
    private static String username;
    private static String passwd;

    static {
        try {
            // 读取配置文件, 初始化连接数据库
            Properties pro = new Properties();
            // 获取 src 路径下的文件 --> ClassLoader
            ClassLoader cl = JDBCUtils.class.getClassLoader();
            URL url = cl.getResource("jdbc.properties");
            String path = url.getPath();  // 配置文件的绝对路径
            // 加载配置文件
            pro.load(new FileReader(path));
            // 获取配置文件中的参数
            ipaddr = pro.getProperty("ipaddr");
            port = pro.getProperty("port");
            dbname = pro.getProperty("dbname");
            username = pro.getProperty("username");
            passwd = pro.getProperty("passwd");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 获取连接
    public static Connection getConnection(){
        try {
            // 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获取连接
            Connection conn = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s", ipaddr, port, dbname), username, passwd);
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //
        return null;
    }

    public static void close(ResultSet ret, Statement statement, Connection conn){
        if (ret!=null) {
            try {
                ret.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement!=null) {
            try {
                ret.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null) {
            try {
                ret.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement pstatement, Connection conn){
        if (pstatement!=null) {
            try {
                pstatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}