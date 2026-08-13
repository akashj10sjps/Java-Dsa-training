package com.advanced.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ECE_B1", "root", "Akash@1234");
        System.out.println("Connection Established!!!");
        String fname="Saurav";
        String lname="R";
        //What is the best way to stop data hacking[SQL injection]
        //We don't directly pass values ,we use Question marks?,?
        //These Questions Marks are called SQL injections
        PreparedStatement ps=connection.prepareStatement("INSERT INTO STUDENT VALUES(?,?)");
        ps.setString(1,fname);
        ps.setString(2,lname);
        //if the output is >0 it's successful,or else not
        int i= ps.executeUpdate();
        if(i>0){
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
        ps.close();
        connection.close();
    }
}
