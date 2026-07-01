package com.dsa.basic;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr[]= {"AVI","PRAJVAL","JASSU","REDDY","LUCKY","PAVITHRA"};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		String str[]=new String[5];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		
		
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println("--------------------");
		
		//USing the for-each loop
		for(String arr2:arr)
		{
			System.out.print(arr2+", ");
		}*/
		
		
	}
	

}
