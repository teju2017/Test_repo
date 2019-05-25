package com.tejas.hibernate.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Deletedata {

	public Deletedata() {
		// TODO Auto-generated constructor stub
	}
	
	public void deleteStudent(int studentid)
    {
		  try
		  {
			System.out.println("The request is to update the emailid for the student id " +studentid);
			Factorysession ft = new Factorysession(Student.class);
			///SessionFactory fact = ft.factoryGenerator();
			/// Session sessdel = fact.getCurrentSession();
			Session sessdel = ft.factoryGenerator();
			sessdel.beginTransaction();
			Student std = sessdel.get(Student.class,studentid);
			sessdel.delete(std);
			sessdel.getTransaction().commit();
			System.out.println("Update is completed");
		  }
		  catch(Exception ae)
		  {
			  if(ae.getMessage().endsWith("null entity"))
			  {
				  System.out.println("The id passed as parameter is not existing");
			  }
			  else
			  {
				  System.out.println("HITTING EXCEPTION :     "+ae.getMessage());
			  }
		  }
	}

}
