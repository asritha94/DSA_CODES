package com.java.ArrayBasics;

import java.util.Arrays;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,2,4,96,43,24};
		int pos=4;
		int arr1[]=new int[arr.length-1];
		for(int i=0;i<pos;i++)
		{
			arr1[i]=arr[i];
			
		}
		for(int i=pos+1;i<arr.length;i++)
		{
			arr1[i-1]=arr[i];
		}
		System.out.println(arr[pos]);
		System.out.println("Old Array : "+Arrays.toString(arr));
		System.out.println("New Array : "+Arrays.toString(arr1));
		
		/*
		 *Another method
		 * int j=0;
		 * for(int i=0;i<arr.length;i++)
		 * {
		 * 		if(arr[i]==pos)
		 * 		{
		 * 			continue;
		 * 		}
		 * 		arr1[j]=arr[i];
		 * 		j++;
		 * }
		 * System.out.println(Arrays.toString(arr1));
		 */
	}
	

}
