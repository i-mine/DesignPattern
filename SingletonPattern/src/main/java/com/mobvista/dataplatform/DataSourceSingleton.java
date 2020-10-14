package com.mobvista.dataplatform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * author: dulei
 * date: 8/26/20-9:30 AM
 * desc: 枚举单例-数据库管理类
 */
public enum DataSourceSingleton {
    DATASOURCE;
    private Connection connection = null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private DataSourceSingleton(){
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection("");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
    public Connection getConnection(){
        return connection;
    }
}
