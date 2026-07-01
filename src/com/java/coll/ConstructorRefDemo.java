package com.java.coll;

import java.util.function.Function;
import java.util.function.Supplier;

class Customer
{
	public Customer()
	{
		System.out.println("I am a regular sustomer");
	}
	String name;
	public Customer(String name)
	{
		this.name=name;
	}
}

public class ConstructorRefDemo {
	public static void main(String args[])
	{
		Supplier<Customer> sup=Customer::new;//Default Constructor
		Customer c=sup.get();
		
		Function<String,Customer> fun=Customer::new;//Parameter Constructor
		Customer ct=fun.apply("Pavithra");
		System.out.println(ct.name);
		
	}

}
