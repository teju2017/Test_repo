package com.tejas.hibernate.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connectivitytest {

	public Connectivitytest() {
		System.out.println("Testing the connectivity");
	}
	
	public void connectivity_test()
	{

		 String Subject;
	     String TestQuery;
	     try
	     {
	    	   Class.forName("com.mysql.jdbc.Driver");
	    	   String Connection_URL="jdbc:mysql://localhost/world?useSSL=false";
	    	   Connection Conn=DriverManager.getConnection(Connection_URL,"root","Hassan@123");
	    	   Statement stmt=Conn.createStatement();
	    	   System.out.println("Connectivity is working fine");
	     }
	     catch(Exception ae)
	     {
	    	  System.out.println("Some issue in connectivity, please check "+ae);
	     }
	}
	
	public static void main(String args[])
	{
	    Connectivitytest con = new Connectivitytest();
	    con.connectivity_test();
	}

}
