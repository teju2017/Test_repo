package com.tejas.hibernate.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factorysession {

	private Class table;
	SessionFactory fact;
	
	public Factorysession(Class table) 
	{
		this.table=table;
		System.out.println("Table name is "+table);
	}
	
	public void setFactory(SessionFactory fact)
	{
		this.fact=fact;
	}
	
	public Session factoryGenerator()
	{
		SessionFactory fact = new Configuration().configure("Hibernate.xml").addAnnotatedClass(table).buildSessionFactory();
		setFactory(fact);
		Session session=fact.getCurrentSession();
		return session;
	}
	
	public void factorySessionClose()
	{
		fact.close();
	}
	
	public void sessionClose(Session sessobj)
	{
		sessobj.close();
	}

}
