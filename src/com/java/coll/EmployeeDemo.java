package com.java.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<>();

		al.add(new Employee(123,"Pavithra"));
		al.add(new Employee(123,"Avi"));
		al.add(new Employee(123,"Reddy"));
		al.add(new Employee(123,"Mekala"));
		
		System.out.println(al);
		Comparator<Employee> c=(e1,e2)->(e1.empid<e2.empid)?-1:(e1.empid>e2.empid)?1:0;
		Collections.sort(al,c);
		System.out.println(al);
	}

}
