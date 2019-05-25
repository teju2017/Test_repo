package com.tejas.learning;

public class Badminton implements RequiredDetails {

	public Badminton() {
		System.out.println("Calling the Badminton programe");
	}

	@Override
	public String jogdetails() {
	    String abc="10 kms of jogging is mandatory";
		return abc;
	}
	
	

}
