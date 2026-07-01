package com.dsa.basic;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,8,2,46,32,53};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value is : "+max);

	}

}
