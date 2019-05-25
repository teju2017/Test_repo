package testframework;

import java.sql.*;

import java.util.*;


public class Test_case 
{
   public String count;
   public Integer count_exp;
   Hashtable<String,String> hm = new Hashtable<String,String>();
   public Test_case()
   {
	      System.out.println("Taking the crendentials for the database login from the constructor");
   }
   public void executor()
   {
	      System.out.println("Working for the Test Framework");
   }
   
   public void Conn_test()
   {
	     
	     String Subject;
	     String TestQuery;
         try
         {
        	   Class.forName("com.mysql.jdbc.Driver");
        	   String Connection_URL="jdbc:mysql://localhost/world";
        	   Connection Conn=DriverManager.getConnection(Connection_URL,"root","Hassan@123");
        	   Statement stmt=Conn.createStatement();
        	   ResultSet Rs=stmt.executeQuery("select * from test_demo");
        	   while(Rs.next())
        	   {
        		     Subject=Rs.getString(3);
        		     TestQuery=Rs.getString(4);
        		     hm.put("Subject",Subject);
        		     hm.put("Query", TestQuery);
        		     hm.put("Expected",Rs.getString(6));
        		     System.out.println("Values in the tables are "+Subject+","+TestQuery);
        	   }
        	   System.out.println("Connectivity is working fine");
        	   Execute_Query(hm);
         }
         catch(Exception ae)
         {
        	   System.out.println("Exception value"+ae);
         }
   }
   
   public void Execute_Query(Hashtable hpar)
   {
	   try
       {
      	   Class.forName("com.mysql.jdbc.Driver");
      	   String Connection_URL="jdbc:mysql://localhost/world";
      	   Connection Conn=DriverManager.getConnection(Connection_URL,"root","Hassan@123");
      	   Statement stmt=Conn.createStatement();
      	   String quy=(String)hpar.get("Query");
      	   System.out.println("Value of String quy is "+quy);
      	   ResultSet Rs1=stmt.executeQuery(quy);
      	   while(Rs1.next())
           {
      		   count=Rs1.getString(1);      		   
      	   }
      	   System.out.println("Value of the count variable is "+count);
      	   Compare_result(count,hm);
       }
       catch(Exception ae)
       {
      	   System.out.println("Exception value"+ae);
       }
   }
   
   public void Compare_result(String count_param, Hashtable hts)
   {
	   System.out.println("This method is to compare the actual and expected result");
	   String expected=(String)hts.get("Expected");
	   if ( count_param.equals(expected) )
	   {
		     System.out.println("Test case :- Succes");
	   }	     
	    else
	    {
		     System.out.print("Test case :- Failed");    	 
	    }
   }
	   
      	   
   public static void main(String args[])
   {
	    Test_case obj = new Test_case();
	    obj.Conn_test();
	   //  obj.executor();
   }
}
