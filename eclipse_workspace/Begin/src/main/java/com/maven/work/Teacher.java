package com.maven.work;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;


public class Teacher {
	private String name;
	private String Subject;
	private int Salary;
	private float experience;

	public Teacher(String Subject, int Salary, float experience, String name) {
		this.Subject = Subject;
		this.Salary = Salary;
		this.experience = experience;
		this.name = name;
	}

	
	public void setSubject(String Subject) {
		this.Subject = Subject;
	}

	
	public String getSubject() {
		return this.Subject;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}

	public int getSalary() {
		return this.Salary;
	}

	public void setexp(float experience) {
		this.Subject = Subject;
	}

	public float getexp() {
		return this.experience;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}
}
