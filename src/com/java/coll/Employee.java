package com.java.coll;

public class Employee {
	
	int empid;
	String empname;
	
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}


	public Employee()
	{

	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}



}
