package com.java.coll;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		li.add(32);
		li.add("Pavithra");
		li.add("Reddy");
		li.add(true);
		li.add(24.2);
		System.out.println(li);
		System.out.println(li.contains("Reddy"));
		System.out.println(li.get(4));

	}

}
