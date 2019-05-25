package Package_tester;

import java.sql.*;
import java.util.*;

public class DatabaseActivity 
{
	public void connectivity_test()
	{

		 String Subject;
	     String TestQuery;
	     try
	     {
	    	   Class.forName("com.mysql.jdbc.Driver");
	    	   String Connection_URL="jdbc:mysql://localhost/world";
	    	   Connection Conn=DriverManager.getConnection(Connection_URL,"root","Hassan@123");
	    	   Statement stmt=Conn.createStatement();
	    	   System.out.println("Connectivity is working fine");
	     }
	     catch(Exception ae)
	     {
	    	  System.out.println("Some issue in connectivity, please check "+ae);
	     }
	}
	public ArrayList read_data(String Query)
	{
		ArrayList<Emptbl> al = new ArrayList();
		try
	     {
	    	   Class.forName("com.mysql.jdbc.Driver");
	    	   String Connection_URL="jdbc:mysql://localhost/world";
	    	   Connection Conn=DriverManager.getConnection(Connection_URL,"root","Hassan@123");
	    	   Statement stmt=Conn.createStatement();
	    	   ResultSet Rs=stmt.executeQuery(Query);
	    	   while(Rs.next())
        	   {
	    		     Emptbl  e2=new Emptbl();
	    		     e2.setname(Rs.getString(1));
	    		     e2.setid(Rs.getString(2));
	    		     e2.setdeptid(Rs.getString(3));
	    		     e2.setdeptname(Rs.getString(4));
	    		     e2.setSalary(Rs.getInt(5));
	    		     e2.setidentifer(Rs.getString(6));
	    		     al.add(e2);
        	   }
	     }	   
	    	 catch(Exception ae)
	    	 {
	    		  System.out.println("Values are "+ae.getMessage());
	    	 }
		return al;
	}	
}
    
