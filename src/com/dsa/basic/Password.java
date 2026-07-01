package com.dsa.basic;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String password="";
		
		while(! password.equals("Avi@734"))
		{
			System.out.println("Enter password");
			password=sc.next();
		}
		System.out.println("Login Success");
		

	}

}
