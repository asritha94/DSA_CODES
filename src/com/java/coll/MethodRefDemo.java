package com.java.coll;

import java.util.Arrays;
import java.util.List;

class PaymentUtil
{
	static double calculateEmi(double amount)
	{
		return amount*0.67;
	}
	public void show(String msg)
	{
		System.out.println(msg);
	}
}

public class MethodRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(10,-10,20,-30,34);
		numbers.stream().map(Math::abs).forEach(System.out::println);
		
		List<Double> amounts=Arrays.asList(1200.34,2341.13);
		amounts.stream().map(PaymentUtil::calculateEmi).forEach(System.out::println);
		
		//instance reference
		
		PaymentUtil pt=new PaymentUtil();
		List<String> messages=Arrays.asList("Hello","Welcome","to","Sleeping world");
		messages.forEach(pt::show);  //instance method reference

	}

}
