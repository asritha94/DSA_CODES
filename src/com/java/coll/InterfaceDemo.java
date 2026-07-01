package com.java.coll;

interface Left
{
	default void m1()
	{
		System.out.println("Left default interface method");
	}
}
interface Right
{
	default void m1()
	{
		System.out.println("Right default interface method");
	}
}
public class InterfaceDemo implements Left,Right{


		public void m1()
		{
			System.out.println("This is a overridden method from the child class");
			Left.super.m1();
			Right.super.m1();
		}

	public static void main(String args[])
	{
		InterfaceDemo i=new InterfaceDemo();
		i.m1();
	}

}
