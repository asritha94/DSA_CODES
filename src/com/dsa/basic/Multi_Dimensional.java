package com.dsa.basic;
import java.util.*;
public class Multi_Dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		int arr[][]= {{12,45,67},{78,90,65},{23,67,88}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	

	}

}
