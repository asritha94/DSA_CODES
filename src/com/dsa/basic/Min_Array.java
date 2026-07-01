package com.dsa.basic;

public class Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,8,2,46,32,53};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value is : "+min);

	}

}
