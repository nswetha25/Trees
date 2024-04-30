package com.telusko.Learning;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFailfastfailsafe {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		//Lets see the difference between using for loop and iterator and why we prefer using itertor for collections
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			al.add(455); //Here while accessing the value itself we are trying to add new element. so what will happen for loop goes on running as we are adding a new element
//			//and it does not throw any error until and unless there is memory error. This we call it as Concurrent modification/Strutural modification
//		}
		
		//Now lets see how the iterator behaves when we do this
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//Now here I am trying to add the element and run the program
			//al.add(450);// SO once it prints the first value and comes to this line it prints an exception "java.util.ConcurrentModificationException" whichmeans
			//iterator has given exception that this adding here is not accepted unlike for loop which did not care. So whenever we are using Iterator it is 
			//Failing fast called failfast leading to an exception which is also not good. I need a solution where my program should not lead to concurrent 
			//modification which shold not lead to exception also.so for this they created a package to avoid this. See below
		}
		
		//To avoid this concurrent exception see below
		
		System.out.println("***************");
		
		CopyOnWriteArrayList cwa=new CopyOnWriteArrayList();
		
		
		cwa.add(100);
		cwa.add(200);
		cwa.add(300);
		cwa.add(400);
		cwa.add(500);
		
		System.out.println(cwa);
		//Our goal is to fail but safely. Now its not allowing concurrent modification and at the same time it is not leading to exception. This is the reason 
		//wehen we are using collection class we have to use iterator instead of for loop
		Iterator it1=cwa.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			cwa.add(333);
		}

	}

}
