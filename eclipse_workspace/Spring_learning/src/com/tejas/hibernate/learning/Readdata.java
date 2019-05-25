package com.tejas.hibernate.learning;

/* This class depicts the example of HQL using the Createquery method
 * Basically we can add condition and return the value in the list 
 * Note that in the "FROM clause we need to mention the class name and not the actual table name 
 */

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Readdata {

	public Readdata() {
		System.out.println("This is to read the data");
	}
	
	public void selectStudent()
	{

		Factorysession abc = new Factorysession(Student.class);
		// SessionFactory factory = abc.factoryGenerator();
		// Session session=factory.getCurrentSession();
		Session session=abc.factoryGenerator();
		session.beginTransaction();
		List<Student> lst = session.createQuery("from Student where studid > 10 AND studid <= 14 AND studname='Willpower'").list(); 
		session.getTransaction().commit();
		System.out.println("Reading the values from the table student");
		if(lst.isEmpty())
		{
			System.out.println("no records available and hence exiting ");
		}
		for(Student stdlst:lst)
		{
			System.out.println("Reading the values from the table student");
			System.out.println("ID= "+stdlst.getId()+" Email = "+stdlst.getEmail()+" name=  "+stdlst.getName());
		}
	}
	
	public void selectDept()
	{

		Factorysession abc = new Factorysession(Department.class);
		// SessionFactory factory = abc.factoryGenerator();
		// Session session=factory.getCurrentSession();
		Session session=abc.factoryGenerator();
		session.beginTransaction();
		List<Department> dpt = session.createQuery("from Department").list();  
		session.getTransaction().commit();
		System.out.println("Reading the values from the table student");
		if(dpt.isEmpty())
		{
			System.out.println("no records available and hence exiting ");
		}
		for(Department deptlst:dpt)
		{
			System.out.println("Reading the values from the table student");
			System.out.println("ID= "+deptlst.getDeptid()+" Deptname = "+deptlst.getDeptname()+" Salary=  "+deptlst.getDeptsalary());
		}
	}

}
