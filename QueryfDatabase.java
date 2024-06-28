package com.fauxy.query;

public class QueryfDatabase {
       public static String query() {
    	   return "select * from register where username = ? and password = ?";
       }
       
       public static String insertquery() {
    	   return "insert into register values(?,?,?)";
       }
}
