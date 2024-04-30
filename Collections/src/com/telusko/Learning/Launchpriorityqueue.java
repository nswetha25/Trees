package com.telusko.Learning;

import java.util.PriorityQueue;

public class Launchpriorityqueue {

	public static void main(String[] args) {
		
//Duplicates are allowed
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(60);
		pq.add(60);
		pq.add(20);
		//pq.add('A');// Here we cant add diff types of data directly . We have to use Generics
		pq.add(0);
		
		System.out.println(pq);
		//we can have diff datatypes to store in seprate queues and display abut if we want to mix them in one queue we need to use Generics
		PriorityQueue pq1=new PriorityQueue();
		pq1.add('s');
		pq1.add('a');
		pq1.add('b');
		//Here the order of insertion is not maintained and at the same time sorted order is also not coming. It follows min heap datastructure
		System.out.println(pq1);//[0, 10, 20, 20, 50, 60, 30, 40]

	}

}
