package com.maven.work;

import javax.xml.bind.annotation.XmlRootElement;


public class Subelement {

	private String tag1;
	private String tag2;
	private String Snacks;

	public Subelement(String tag1, String tag2,String Snacks) {
		// TODO Auto-generated constructor stub
		this.tag1 = tag1;
		this.tag2 = tag2;
		this.Snacks=Snacks;
		
	}

	public void settag1(String tag1) {
		this.tag1 = tag1;
	}

	public void settag2(String tag2) {
		this.tag2 = tag2;
	}

	public void setsnacks(String Snacks) {
		this.Snacks = Snacks;
	}

	

	public String gettag1() {
		return this.tag1;
	}

	public String gettag2() {
		return this.tag2;
	}

	public String getsnacks() {
		return this.Snacks;
	}

}
