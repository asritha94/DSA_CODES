package com.java.ArrayBasics;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,3,0,12};
		int newArr[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				continue;
			}
			newArr[j]=arr[i];
			j++;
			/*
			 * if(arr[i]!=0)
			{
				newArr[j]=arr[i];
				j++;
			}
			 */
		}
		System.out.println("Array after moving zeroes to last : "+Arrays.toString(newArr));

	}

}
