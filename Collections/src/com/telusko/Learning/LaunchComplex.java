package com.telusko.Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student{
	 String name;
	 int age;
	public int id;
	
	public student(String name, int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
		
	
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public student(int age) {
		name="swetha";
		this.age=age;
		id=4;
		
	}
	
	public student() {
		name="Akhil";
		age=28;
		id=2;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAge() {
		return age;
	}
@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
}
class Alpha implements Comparator<student>{

	//this comparator has only one abstract method
	@Override
	public int compare(student o1, student o2) {
		if(o1.age>o2.age)
		{
			return 1;
		}
		return -1;
		
	}

	
		
	
	
}

public class LaunchComplex {

	public static void main(String[] args) {
		student st=new student();
		System.out.println(st);
		
		student st1=new student(18);
		System.out.println(st1);
		
		student st2=new student("swe",28,3);
		System.out.println(st2);
		//See I am creating an array list and I am storing the data present in my student class in the collection and I am able to store and print it
		ArrayList arr=new ArrayList();
		arr.add(st);
		arr.add(st1);
		arr.add(st2);
		arr.add("som");//we can add any type of data along with our class data. but if I want to work only with student type of data not allwo to ada any other data
		//then we have to use Generics concept like below
		ArrayList<student> arr2=new ArrayList();
		
		arr2.add(st);
		arr2.add(st1);
		arr2.add(st2);
		//arr2.add("som");//see if I use this generic type of data i willl get the eror that it say we are only allowing student type of data and cant add anyother type of data
		
		
		System.out.println(arr); // [Nadella 28, swetha 18, swe 28]
		
		//Previously I am able to sort the simple data present in Sortdata class but here I am trying to sort the dsta present in a class and when I do this
		//i dont get any compile time error but I am getting an exception that "classcastexception". It is confused because we are asking to sort the class which 
		//has many diff thype of data and it does not understand through which it should sort. Now we have to inform whether we have to sort based on what
		//we provide that informaaion by using Comparator and comparable
		
		//Collections.sort(arr);//commenting it as we are getting an exception
		
		//System.out.println(arr);
		
		//So as we saw above that if we trying to use sort method directly it throws an exception but if we use comparator method then it works good
		//There is an interface comparator which needs to be included
		
		Alpha a=new Alpha();
		//Here in the alpha method there is a implementation for compare method. so as we have only one method present and we can do this using 
		//anonymous class also. I will be implementing the same one in LaunchComplex2
		Collections.sort(arr2,a);
		System.out.println(" Comparing based on id :"+arr2);
		
		
		
		

	}

}
