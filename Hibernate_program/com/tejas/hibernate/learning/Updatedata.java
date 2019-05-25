package com.tejas.hibernate.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Updatedata {

	public Updatedata() {
	    System.out.println("Updating the data");
	}
	
	public void updateStudent(int studentid)
	{
		System.out.println("The request is to update the emailid for the student id " +studentid);
		Factorysession ft = new Factorysession(Student.class);
		// SessionFactory fact = ft.factoryGenerator();
		// Session sessupd = fact.getCurrentSession();
		try
		{
		 Session sessupd = ft.factoryGenerator();
		 sessupd.beginTransaction();
		 System.out.println("Student id value is "+studentid);
		 Student std = sessupd.get(Student.class,studentid);
		 std.setEmail("abc@hotmail.com");
		 std.setName("Jeevanada payana");
		 sessupd.getTransaction().commit();
		 System.out.println("Update is completed");
		}
		catch(Exception ae)
		{
			System.out.println("Hitting exception " +ae.getMessage());
			System.out.println("ID passed as parameter is not present and hence exiting");
		}
	}
	

}
