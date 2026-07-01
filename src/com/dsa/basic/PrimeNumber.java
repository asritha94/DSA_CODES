package com.dsa.basic;
import java.util.*;
public class PrimeNumber {
	int count=1;
	
	int primeNumber(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%2 != 0 )
			{
				count++;
			}
			else
			{
				return count;
			}
			return count;
			
		}
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrimeNumber p=new PrimeNumber();
		int ex=p.primeNumber(n);
		if(ex==1)
		{
			System.out.println("NOT Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}

}
