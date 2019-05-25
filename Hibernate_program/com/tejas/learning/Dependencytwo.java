package com.tejas.learning;

public class Dependencytwo implements RequiredDetails {

	private RequiredDetails req;
	
	public Dependencytwo(RequiredDetails req) {
		this.req=req;
	}
	
	public Dependencytwo()
	{
		System.out.println("Default constructor ");
	}
	
	public String jogdetails()
	{
		String a="Dependency two class and its working";
		return a;
	}
	
	public RequiredDetails retobj()
	{
		return this.req;
	}
	
	
}
