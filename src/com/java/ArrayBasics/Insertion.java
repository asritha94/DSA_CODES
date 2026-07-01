package com.java.ArrayBasics;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,3,9,2,47};  //arr1[4]=arr1[3]
		int pos=3;
		int ele=88;
		//Creating the new array for to insert the value
		int arr1[]=new int[arr.length+1];
		//insert elements upto pos
		for(int i=0;i<pos;i++)
		{
			arr1[i]=arr[i];
		}
		//insert element at certain position
		arr1[pos]=ele;
		//inserting the values after position
		for(int i=pos+1;i<arr1.length;i++)
		{
			arr1[i]=arr[i-1];
		}
		/*
		 * for(int i=pos;i<arr.length;i++)
		 * {
		 * 	arr1[i+1]=arr[i];
		 * }
		 */
				
		System.out.println("Old array : "+Arrays.toString(arr));
		System.out.println("New Array : "+Arrays.toString(arr1));
			

	}

}
