package com.java.Excep;

public class LambdaDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Seetha thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(""
					+ "Rama thread");
		}
		

	}

}
