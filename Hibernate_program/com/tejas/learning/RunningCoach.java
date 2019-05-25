package com.tejas.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunningCoach {

	public RunningCoach() {
		System.out.println("Running coach details");
	}
	
	
	public static void main(String args[])
	{
		RunningCoach abc = new RunningCoach();
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("application.xml");
		
		/* This is to return the object for the Interface, 
		please note that the object can only call the method defined in the
		Interface */
		
		RequiredDetails trk = context.getBean("mycoach",RequiredDetails.class);
		// trk.accepted();
		System.out.println(trk.jogdetails());
	    Badminton brk = context.getBean("shuttle",Badminton.class);
	    System.out.println(" ===============================       ");
	    System.out.println("Details of running for the Badminton");
	    System.out.println(brk.jogdetails());
	    System.out.println(" ===============================       ");
	    System.out.println(" Taking the object from the Dependency class");
	    Dependencytwo dtwo = context.getBean("Depend2",Dependencytwo.class);
	    System.out.println(dtwo.jogdetails());
	}
	
	

}
