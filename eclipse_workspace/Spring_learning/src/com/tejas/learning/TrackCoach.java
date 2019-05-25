package com.tejas.learning;

public class TrackCoach implements RequiredDetails {

	public TrackCoach() {
	  System.out.println("Calling the TrackCoach" );
	}
	
	public void accepted()
	{
	   System.out.println("Accepted the value ");
	}
	
	public String jogdetails()
	{
		String str="5 kms of Jogging";
		return str;
	}

}
