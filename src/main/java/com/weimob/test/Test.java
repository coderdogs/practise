package com.weimob.test;

import java.sql.*;

/**
 * Created by Administrator on 2018/2/14.
 */
public class Test {
    public static final String DB_URL = "jdbc:mysql://test.marrymeng.com:3306/user";
    public static final String USER = "root";
    public static final String PASS = "951011";

    Connection conn = null;
    public Connection getConn() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection= DriverManager.getConnection(DB_URL, USER, PASS);//注意是三个参数
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
   //增
    public int insert(){
        int i=0;
        String sql="insert into t_goods_info(id,,goods_id) values(3877,'123',)";
        Connection cnn=getConn();

        try{
            PreparedStatement preStmt =cnn.prepareStatement(sql);
            preStmt.setString('1',String.valueOf(12));
            preStmt.setString('2',String.valueOf(111));
            i=preStmt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return i;//返回影响的行数，1为执行成功
    }

    public int update(){
        int i = 0;
        String sql = "update (t_goods_info) set  (id)=id1,goods_id=goods_id1 where (id)=3877";
        Connection cnn = getConn();
        try {
            PreparedStatement preStmt = cnn.prepareStatement(sql);
            preStmt.setString(1,String.valueOf(12));
            preStmt.setString(2, String.valueOf(12));
            i = preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public String select(){
        String sql = "select * from t_goods_info";
        Connection cnn = getConn();//此处为通过自己写的方法getConn()获得连接
        try
        {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if(rs.next())
            {
                int m1 = rs.getInt(1);
                String m2 = rs.getString(2);
            }
            //可以将查找到的值写入类，然后返回相应的对象
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return ("12");
    }


}

