package com.maven.work;

import javax.xml.bind.annotation.XmlRootElement;


public class Childclass {

	private String Firstname;
	private String Lastname;

	public Childclass(String Firstname, String Lastname) {
		this.Firstname = Firstname;
		this.Lastname = Lastname;
	}

	public void setfname(String Firstname) {
		this.Firstname = Firstname;
	}

	public void setlname(String Lastname) {
		this.Lastname = Lastname;
	}

	public String getfname() {
		return this.Firstname;
	}

	public String getlname() {
		return this.Lastname;
	}

}
