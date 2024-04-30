package com.telusko.Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class launchMap4 {
	public static void main(String[] args) {
	
	ArrayList list=new ArrayList();
	list.add(10);
	list.add(20);
	
	//can also create collection like below
	
	List list2=Arrays.asList(10,20,30,40);
	
	//loop is external to collection which cna be used anywerh in java 
	for(Object l:list2) {
		System.out.println(l);
	}
	//And one more way is below which is for each which has consumer action which means consumer interface is functional interace which has only one method to implement
	
	//And we can use lambda expression directly for functional interface
	list2.forEach(n->System.out.println(n));//I am implementing the consumer interface here using lambda exp
	//I can go for anonymous inner class also
	
	Consumer c=new Consumer() {
		public void accept(Object arg1) {
			System.out.println(arg1);
		}
	};
	list2.forEach(c);
	
	
	
	
	}

}
