package com.tejas.learning;

public class Depedencyone implements RequiredDetails {

	public Depedencyone() {
		System.out.println("Dependency one");
	}

	@Override
	public String jogdetails() {
		String aa="Dependency one";
		return aa;
	}
	
	

}
