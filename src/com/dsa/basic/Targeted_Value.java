package com.dsa.basic;

public class Targeted_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,8,2,46,32,53,5,1};
		int target=32;
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				found=true;
				break;
			}
			
		}
		System.out.println(found? " found ": " not found ");
	}

}
