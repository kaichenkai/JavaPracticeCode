package com.company.JDBC;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Jdbc_05_数据库连接池_c3p0 {
    public static void main(String[] args) throws SQLException {
        // 创建数据连接池对象 (使用javax.sql 包下的DataSource 父类接口 指向子类引用, 多态写法)
        DataSource pool = new ComboPooledDataSource();
        Connection conn = pool.getConnection();
        // 打印连接对象
        // com.mchange.v2.c3p0.impl.NewProxyConnection@33e5ccce [wrapping: com.mysql.jdbc.JDBC4Connection@5a42bbf4]
        System.out.println(conn);
    }
}

