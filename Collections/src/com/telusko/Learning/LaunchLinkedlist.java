package com.telusko.Learning;

import java.util.LinkedList;

public class LaunchLinkedlist {

	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		
		//Lets add some methods here we are using the same add method so it is a part of collection not just Linkedlist as we are suing the same method in ArrayList also
		link.add(10);
		link.add(20);
		link.add(30);
		link.add(40);
		System.out.println(link);
		link.add(2,50);
		System.out.println(link);
		
		//Now as Linkedlist is part of list and also dequeue I have some methods only present in dequeue like addFirst which is not there in List so I cant use htis method
		//in arrayList
		//Here in Linkedinlist we can add the elements at a specified index like arraylist but unlike array list this is efficient because Linkedlist follows
		//doubly linked list datastructure. So the references of both nodes connecting each other will be stored.So when I insert any element there is no shifiting anywhere
		//Like it will just  change the reference alone
		link.addFirst(100);
		System.out.println(link);
		link.addLast(300);
		System.out.println(link);
		//Without any argumenst will remove the first element
		link.remove();
		System.out.println(link);
		//If I want to remove the specific element, I have to explicitly create an integer object and then pass it to the remove method
		Integer ele=300;
		boolean isRemoved = link.remove(ele);
		System.out.println(link);
		//link.remove(100);//cannot directly remove the element by passing it to remove  method need to store that in its data type and then pass it to remove method
		
		Integer eleme=40;
		boolean isremov=link.remove(eleme);
		
		System.out.println(link);
		
		System.out.println("***********************");
		//Order of insertion is maintained
		
		LinkedList link2=new LinkedList();
		
		//Duplicates are permitted in both arraylist and linkedlist
		
		link2.add(100);
		link2.add(200);
		link2.add(300);
		link2.add(400);
		link2.add(500);
		link2.add(600);
		
		System.out.println(link2);
		
		//Here both peekfirst and pollfirst will fetch the first object present in the collection but pollFirst will remove the object present so if I print the 
		//list after pollFirst we can see that the first elment is gone . Similayr there is peekLast and pollLast
		
		System.out.println(link2.peekFirst());
		System.out.println(link2);
		
		System.out.println(link2.pollFirst());
		System.out.println(link2);
		
		//Both these add and offer methods do same but there is one diff like if I use add 100% that element is added but if I use offer sometimes if there is any m/y issue
		//it will not get added to our list 
		link2.add(700);
		link2.offer(900);
		System.out.println(link2);
		
		
		
		
		

	}

}
