package Package_tester;

import java.util.*;


import testframework.*;

public class Collcheck 
{
	Hashtable<String,Emptbl>  hmp = new Hashtable();
	Emptbl empobj=new Emptbl();
	ArrayList<Emptbl> al1 = new ArrayList();
	
	 public Collcheck()
	 {
		  System.out.println("Working on using the HashTable");
	 }
	 
	 public void insert_emps(String a,String b, String c, String d, int e)
	 {
		 String name_1=a;
		 empobj.setname(a);
		 empobj.setid(b);
		 empobj.setdeptname(c);
		 empobj.setdeptid(d);
		 empobj.setSalary(e);
		 hmp.put("ROW1",empobj);
	 }
	 
	 
	 public void display_values(Emptbl e1)
	 {
		 System.out.println("Displyaing the value from the object");
		 System.out.println("name="+e1.getname()+",id="+e1.getid()+",salary="+e1.getSalary()+",deptname="+e1.getdeptname()+",deptid="+e1.getdeptid());
	 }
	 
	 public void retrieve_values(Hashtable hmarg)
	 {
		 Set<String> S1 = hmarg.keySet();
		 String Z;
		 Emptbl e = new Emptbl();
		 for(String key:S1)
		 {
			 System.out.println("value of the key is "+key);
			 e=(Emptbl)hmarg.get(key);
			 System.out.println("Value of e is "+e);
			 display_values(e);
		 }
		 
		 
	 }
	 
	 public void connection_test()
	 {
		   /*Test_case tt=new Test_case();
		   tt.Conn_test();*/
		 DatabaseActivity db = new DatabaseActivity();
		 db.connectivity_test();
	 }
	 
	 public void db_memory_loading()
	 {
		 System.out.println("populate the data");
		 String Quy="select * from emp";
		 DatabaseActivity db = new DatabaseActivity();
		 System.out.println("Calling the READ_DATA method");
		 al1=db.read_data(Quy);
		 Iterator at = al1.iterator();
		 System.out.println("Name|id|deptid|deptname|Salary|Identifier");
		 while(at.hasNext())
		 {   
			 Emptbl loc=(Emptbl)at.next();
			 System.out.println(loc.getname()+"|"+loc.getid()+"|"+loc.getdeptid()+"|"+loc.getdeptname()+"|"+loc.getSalary()+"|"+loc.getidentifer());
					 
		 }
	 }
	 
	 public static void main(String args[])
	 {
		  Collcheck c1 = new Collcheck();
		  c1.insert_emps("Tejas","1","CST","220",7000);
		  c1.retrieve_values(c1.hmp);
		  System.out.println("Testing the connectivity to the database ");
		  c1.connection_test();
		  c1.db_memory_loading();
	 }

	 
	 

}
