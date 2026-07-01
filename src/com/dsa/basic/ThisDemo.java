package com.dsa.basic;

class SuperDemo
{
    int salary=6000;
    public void getSalary(int salary)
    {
        salary=5000;
        System.out.println("My parent salary : "+salary);
    }
}

public class ThisDemo extends SuperDemo{
	int salary=3000;
	public void getSalary(int salary)
	{
		salary=2000;
		System.out.println("");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo t=new ThisDemo();

	}

}
