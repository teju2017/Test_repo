package com.maven.work;

public class HelloMaven {

	public HelloMaven() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello Maven working ");
	}

	public void display(String param) {
		System.out.println("Param value passed is " + param);
		System.out.println("Checkint");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xsd = "Tejas";
		HelloMaven ab = new HelloMaven();
		ab.display(xsd);
	}

}
