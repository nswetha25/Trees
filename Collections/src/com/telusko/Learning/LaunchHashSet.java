package com.telusko.Learning;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHashSet {

	public static void main(String[] args) {
		//Implements Set Interface
		
		HashSet hs=new HashSet();
		//Index based insertion is not allowed. No order of insertion maintained
		//Duplicates are not allowed in both hashset and linkedinhashset
		
		hs.add(100);
		hs.add(200);
		hs.add(250);
		hs.add(00);
		hs.add(0);
		hs.add(10);
		hs.add(10);
		
		System.out.println(hs);
		
		//They introduced later one more hashSet called LinkedHashSet. only one diff is here order of insertion is preserved
		
		//Extends HashSet class. Subclass of HashSet
		LinkedHashSet lhs=new LinkedHashSet();
		
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(250);
		lhs.add(00);
		lhs.add(0);
		lhs.add(10);
		lhs.add(10);
		
		System.out.println(lhs);
		
		
		
		

	}

}
