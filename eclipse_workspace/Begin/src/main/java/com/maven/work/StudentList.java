package com.maven.work;

import java.util.*;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="STUDENT")

public class StudentList {
	private ArrayList<Student> stud;
	private ArrayList<Teacher> tchlist;
	private String schname;
	private String city;
	private ArrayList<Childclass> chldlist;

	public void setStudlist(ArrayList<Student> stud) {
		this.stud = stud;
	}

	public ArrayList<Student> getStudlist() {
		return stud;
	}

	public void settchlist(ArrayList<Teacher> tchlist) {
		this.tchlist = tchlist;
	}

	public ArrayList<Teacher> gettchlist() {
		return this.tchlist;
	}

	public void setchlist(ArrayList<Childclass> chldlist) {
		this.chldlist = chldlist;
	}

	public ArrayList<Childclass> getchlist() {
		return this.chldlist;
	}

	public void setschool(String schname) {
		this.schname = schname;
	}

	@XmlElement
	public String getschool() {
		return schname;
	}

	public void setcity(String city) {
		this.city = city;
	}

	
	public String getcity() {
		return city;
	}

	public void adddetails(Student std) {
		try {
			if (stud == null) {
				stud = new ArrayList<Student>();
			}
			stud.add(std);
		} catch (Exception ae) {
			System.out.println("Exception value is " + ae.getMessage());
		}
	}

	public void addTeachers(Teacher tch) {
		try {
			if (tchlist == null) {
				tchlist = new ArrayList<Teacher>();
			}
			tchlist.add(tch);
		} catch (Exception ae) {
			System.out.println("Exception value is " + ae.getMessage());
		}
	}

	public void addchdlist(Childclass chd) {
		try {
			if (chldlist == null) {
				chldlist = new ArrayList<Childclass>();
			}
			chldlist.add(chd);
		} catch (Exception ae) {
			System.out.println("Exception value is " + ae.getMessage());
		}
	}

}
