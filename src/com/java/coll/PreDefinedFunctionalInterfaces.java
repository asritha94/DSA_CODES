package com.java.coll;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(23));
		System.out.println(p.test(26));
		
		String[] names={"Bahubali","Pavithra","Reddy","AVi","Harshitha","Nandini"};
		for(String str:names)
		{
			Predicate<String> p1=s->s.length()>5;
			if(p1.test(str))
			{
				System.out.println(str);
			}
			
		}
		
		Function<Integer,Integer> f=k->k*k;
		System.out.println(f.apply(2));
		System.out.println(f.apply(5));
		
		Function<String,Integer> f1=st->st.length();
		System.out.println(f1.apply("Pavithra"));
		System.out.println(f1.apply("Mekala"));
		
		Function<String,String> f2=st1->st1.toUpperCase();
		System.out.println(f2.apply("Pavithra"));
		System.out.println(f2.apply("reddy"));
		
		Consumer<String> c=l->System.out.println(l);
		c.accept("Codegnan");
		c.accept("Java Date Stack Course");
		
		Supplier<Date> d=()->new Date();
		System.out.println(d.get());
		
		Supplier<String> st=()->
		{
			String otp="";
			for(int i=1;i<=6;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(st.get());

	}

}
