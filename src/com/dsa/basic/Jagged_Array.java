package com.dsa.basic;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{12,45},{78,90,65,89},{23,67,88}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}

}
