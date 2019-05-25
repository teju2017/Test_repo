package com.tejas.hibernate.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Coreworking {

	public Coreworking() 
	{
       System.out.println("Checking the core working");
	}
	
	public void methodInsert()
	{
		// SessionFactory factory = new Configuration().configure("Hibernate.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		// Session session = factory.getCurrentSession();
		//SessionFactory deptfactory = new Configuration().configure("Hibernate.xml").addAnnotatedClass(Department.class).buildSessionFactory();
		// Session deptsession = deptfactory.getCurrentSession();
		
		
		
		
		  Factorysession abc = new Factorysession(Student.class);
		  // SessionFactory factory = abc.factoryGenerator();
		  // Session session=factory.getCurrentSession();
		
	    try
	    {
	    	Student stud[] = new Student[9];
	    	stud[0] = new Student("Amma","thejas.hm@gmail.com");
	    	stud[1] = new Student("Anna","thejas.hm@gmail.com");
	    	stud[2] = new Student("Willpower","thejas.hm@gmail.com");
	    	stud[3] = new Student("Can do Attitude","thejas.hm@gmail.com");
	    	stud[4] = new Student("Perseverance","thejas.hm@gmail.com");
	    	stud[5] = new Student("Horata","thejas.hm@gmail.com");
	    	stud[6] = new Student("Horatada aa Dinagalu","thejas.hm@gmail.com");
	    	stud[7] = new Student("Soluva mana ella","thejas.hm@gmail.com");
	    	stud[8] = new Student("Jeevanave ondhu horata","thejas.hm@gmail.com");
	    	System.out.println("Beginning the transaction");
	    	Session session=abc.factoryGenerator();
	    	session.beginTransaction();
	    	for(int z=0;z<stud.length;z++)
	    	{
	    		session.save(stud[z]);	
	    	}
	    	session.getTransaction().commit();
	    	abc.sessionClose(session);
	    	abc.factorySessionClose();
	    	System.out.println("Ending the transaction");
	    	
	    	System.out.println("Inserting into the Department table");
	    	Department dptlist[] = new Department[4];
	    	dptlist[0] = new Department("Instum",50000);
	    	dptlist[1] = new Department("EC",200000);
	    	dptlist[2] = new Department("Electrical",50000);
	    	dptlist[3] = new Department("Royal mech",50000);
	    	
	    	Factorysession obj2 = new Factorysession(Department.class);
	    	// SessionFactory factorytwo = obj2.factoryGenerator();
	    	Session sessiontwo=obj2.factoryGenerator();
	    	sessiontwo.beginTransaction();
	    	System.out.println("Length of the array is "+dptlist.length);
	    	for(int z=0;z<dptlist.length;z++)
	    	{
	    	  sessiontwo.save(dptlist[z]);
	    	  System.out.println("Z value is "+z);
	    	}
	    	  sessiontwo.getTransaction().commit();
	    	  obj2.sessionClose(sessiontwo);
	    	
	    	/* System.out.println("Adding the records into the Deptname ");
	    	Department dpt = new Department(12,"working",10000);
	    	//deptsession.beginTransaction();
	    	//deptsession.save(dpt);
	    	session.beginTransaction();
	    	session.save(dpt);
	    	session.getTransaction().commit(); */
	    }
	    catch(Exception ae)
	    {
	    	System.out.println("Exception value is "+ae.getMessage());
	    }
	    finally
	    {
	    	abc.factorySessionClose();
	    }
		}
	
	
}	
			
			