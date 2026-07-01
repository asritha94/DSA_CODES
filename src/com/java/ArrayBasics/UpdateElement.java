package com.java.ArrayBasics;

import java.util.Arrays;

public class UpdateElement {
	
	static void updateElement(int arr[],int size,int position,int newVal)
	{
		if(position<0||position>=size)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			arr[position]=newVal;
			System.out.println("Updated data : "+position+" "+newVal);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,2,84,23};
		UpdateElement.updateElement(arr,arr.length,3,77);
	}

}
/*
 * //Updating the particular index value
		int updatedValue=53;
		int updatedPos=7;
		if(updatedPos<0 || updatedPos>arr1.length)
		{
			System.out.println("Updating the array not possible");
		}
		else
		{
			arr[updatedPos]=updatedValue;
			System.out.println("Updated Array : "+Arrays.toString(arr));
		}
 */
