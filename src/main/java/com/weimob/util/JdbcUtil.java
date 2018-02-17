package com.weimob.util;

import java.sql.*;

/**
 * Created by Administrator on 2018/2/14.
 */
public class JdbcUtil {

    public static final String DB_URL = "jdbc:mysql://test.marrymeng.com:3306/user";
    public static final String USER = "root";
    public static final String PASS = "951011";

    Connection conn = null;

    /**
     * 获取一个数据库连接
     * @return
     */
    public Connection getConn() {
        //判断有无存活的数据库连接
        try {
            if (conn!=null&&!conn.isClosed()) {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //注意是三个参数
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * <p>执行插入操作</p>
     * @param sql 需要执行的sql
     * @return
     */
    public int insert(String sql) {
        int resLine = 0;
        Connection cnn = getConn();
        try {
            PreparedStatement preStmt = cnn.prepareStatement(sql);
            resLine = preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resLine;//返回影响的行数，1为执行成功
    }

    /**
     * 执行更新操作，包括删除
     * @param sql
     * @return
     */
    public int update(String sql) {
        int i = 0;
        Connection cnn = getConn();
        try {
            PreparedStatement preStmt = cnn.prepareStatement(sql);
            i = preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 查询结果
     * @param sql
     * @return
     */
    public ResultSet select(String sql) {
        Connection cnn = getConn();//此处为通过自己写的方法getConn()获得连接
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
            //可以将查找到的值写入类，然后返回相应的对象
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

