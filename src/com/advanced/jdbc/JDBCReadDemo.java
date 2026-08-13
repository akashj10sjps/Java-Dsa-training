package com.advanced.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCReadDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ECE_B1","root","Akash@1234");
        System.out.println("Connection Established!!!");
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery("SELECT * FROM STUDENT");
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        rs.close();
        statement.close();
        connection.close();
    }
}
