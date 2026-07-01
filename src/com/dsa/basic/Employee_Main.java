package com.dsa.basic;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(101,"AVI","HYD",50000);
		Employee emp2=new Employee(102,"PRAJVAL","AP",60000);
		Employee emp3=new Employee(103,"LUCKY","BANG",70000);
		Employee emp4=new Employee(104,"PAVITHRA","DELHI",80000);
		
		Employee e[]= {emp1,emp2,emp3,emp4};
		for(Employee emp:e)
		{
			System.out.println(emp);
		}

	}

}
