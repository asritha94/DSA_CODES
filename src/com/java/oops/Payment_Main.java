package com.java.oops;

interface Payment
{
	void pay();
}

class Upi implements Payment
{
	@Override
	public void pay()
	{
		System.out.println("Paying through upi");
	}
}
class CreditCard implements Payment
{
	@Override
	public void pay()
	{
		System.out.println("Paying through CreditCard");
	}
}


public class Payment_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1;
		p1=new Upi();
		p1.pay();
		
		Payment p2;
		p2=new CreditCard();
		p2.pay();
		

	}

}
