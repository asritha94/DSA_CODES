package com.dsa.basic;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal=10000;
		int withdraw=sc.nextInt();
		if(withdraw>bal) {
			System.out.println("Insufficient balance");
		}
		else
		{
			System.out.println("Withdraw Success : "+withdraw);
		}
	}

}
