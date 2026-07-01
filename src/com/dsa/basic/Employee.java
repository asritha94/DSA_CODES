package com.dsa.basic;

public class Employee {
	int empid;
	String empName;
	String empAdd;
	int empsal;
	
	Employee(int empid,String empName,String empAdd,int empsal)
	{
		this.empid=empid;
		this.empName=empName;
		this.empAdd=empAdd;
		this.empsal=empsal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empAdd=" + empAdd + ", empsal=" + empsal + "]";
	}
	

}
