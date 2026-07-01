package com.java.Excep;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int arr[]=new int[5];
			//arr[4]=45/0;
			arr[4]=45/10;
			String s="Pavithra";
			String s2="123";
			System.out.println(s.length());
			System.out.println(s2.length());
			
			int x=Integer.parseInt(s);
			int y=Integer.parseInt(s2);
			
			System.out.println();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is a finally block");
		}

	}

}
