package com.telusko.Learning;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sortdata {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add(100);
		ts.add(200);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		
		System.out.println(ts);
		
		System.out.println("********************");
		
		//We know the data present in treeset comes sorted but i want the data present in linekd list need to sorted then what?
		//Treeset is one of the way to srot the data. What if the data is present in any other collection but u cant change it to any other set.
		//For this purpose collection has provided one way to sort the data present in others.
		
		LinkedList link=new LinkedList();
		link.add(60);
		link.add(50);
		link.add(30);
		link.add(40);
		
		System.out.println("Before sorting :"+link);
		
		//Collection  is a utility class to work on the data present in collection. It ahs so manyinbuilt method like shuffle, 
		
		Collections.sort(link);
		
		System.out.println("After sorting :"+link);
		
		Collections.reverse(link);
		System.out.println("After reversing :"+link);
		
TreeSet ts2=new TreeSet();
		
		ts2.add("swetha");
		ts2.add("d");
		ts2.add("swe");
		
		System.out.println(ts2);
		

		//Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
TreeSet ts1=new TreeSet();
		
		ts1.add("a");
		ts1.add("d");
		ts1.add("swe");
		ts1.add(150);
		ts1.add(25);
		ts1.add("akh");
		
		System.out.println(ts1);
		
		
		
	}

}
