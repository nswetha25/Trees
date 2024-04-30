//Before collection there are many things like vector, dict, hash etc but after introducing collection this is included in that only
package com.telusko.Learning;

import java.util.Enumeration;
import java.util.Vector;

import java.util.*;

public class LaunchVector {

	public static void main(String[] args) {
		//No diff between list adn vector it has all the features of list. 
		//vector belongs to legacy classes whereas list belongs to collections. So vector has enumerator and list has iterator
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add("swetha");
		System.out.println(v);
		
		//calling iterator and enumerator is same.
		
		Enumeration en=v.elements();
		Iterator it=v.iterator();
		while(it.hasNext()) {
		System.out.println("iterator :"+it.next());
		}
		while(en.hasMoreElements()) {
		
		
		System.out.println("Enumerator :"+en.nextElement());
		}
		
		
		

	}

}
