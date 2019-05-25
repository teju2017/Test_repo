package com.tejas.hibernate.learning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Deptid")
	private int Deptid;
	
	@Column(name="deptname")
	private String deptname;
	
	@Column(name="deptsalary")
	private int deptsalary;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String deptname, int deptsalary) {
		super();
		//this.Deptid = deptid;
		this.deptname = deptname;
		this.deptsalary = deptsalary;
	}

	public int getDeptid() {
		return Deptid;
	}

	public void setDeptid(int deptid) {
		Deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getDeptsalary() {
		return deptsalary;
	}

	public void setDeptsalary(int deptsalary) {
		this.deptsalary = deptsalary;
	}
	


}
