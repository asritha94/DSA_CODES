package com.java.coll;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		date.getDayOfMonth();
		
		date.getDayOfYear();
		date.getDayOfWeek();
		date.getMonthValue();
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		time.getHour();
		time.getMinute();
		time.getSecond();
		time.getNano();
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//Particular date and time
		LocalDateTime ldt=LocalDateTime.of(1994,06,04,11,11,11);
		System.out.println(ldt);
		
		LocalDate ld=LocalDate.of(1983,03,23);
		System.out.println("After six months: "+ld.plusMonths(6));
		System.out.println("Before six months : "+ld.minusMonths(6));
		
		//Period of date year time
		LocalDate today=LocalDate.now();
		
		LocalDate bdy=LocalDate.of(2004, 07, 03);
		
		Period p=Period.between(bdy, today);
		System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays());
		
		//Zoned date and time
		
		ZoneId in =ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(in);
		System.out.println(zt);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year :  ");
		
	}

}
