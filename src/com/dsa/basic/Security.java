package com.dsa.basic;
import java.util.Scanner;
public class Security {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String userName=sc.nextLine();
		String password=sc.nextLine();
		if(userName.equals("Pavithra")&& password.equals("Pavi@123"))
			 
		{
			System.out.println("It is valid");
		}
		else
		{
			System.out.println("Not a valid credentials");
		}
		/*
		 * It is not a valid one .
		 * Because both the string object reference is different
		 * if(userName=="Pavithra"&& password=="Pavi@123")
		 
		{
			System.out.println("It is valid");
		}
		else
		{
			System.out.println("Not a valid credentials");
		}
		*/

	}

}
