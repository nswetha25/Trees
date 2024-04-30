package com.telusko.Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student1{
	 String name;
	 int age;
	public int id;
	
	public student1(String name, int age,int id) {
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


	public student1(int age) {
		name="swetha";
		this.age=age;
		id=4;
		
	}
	
	public student1() {
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
//class Alpha1 implements Comparator<student>{
//
//	//this comparator has only one abstract method
//	@Override
//	public int compare(student o1, student o2) {
//		if(o1.age>o2.age)
//		{
//			return 1;
//		}
//		return -1;
//		
//	}
//
//	
//		
//	
//	
//}

public class LaunchComplex2 {

	public static void main(String[] args) {
		
		student1 st1=new student1();
		student1 st2=new student1(18);
		student1 st3=new student1("swe",28,3);
		
		ArrayList arr=new ArrayList();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		
ArrayList<student1> arr2=new ArrayList();
		
		arr2.add(st1);
		arr2.add(st2);
		arr2.add(st3);
		
		//Alpha a1=new Alpha() {
		
		//As we have only one method compare so instead of creating a new class and implementeing the comparator and then using the method like above I can directly
		//go for lambda expression
		
		//Here we are comparing with id
		Comparator<student1> cmp=(student1 ref1,student1 ref2)->{
			if(ref1.id>ref2.id) {
				return 1;
			}
			return -1;
			
		};
		Collections.sort(arr2,cmp);
		System.out.println(" Comparing based on id :"+arr2);

		//Lets compare with age 
		Comparator<student1> cmp2=(student1 ref1,student1 ref2)->{
			if(ref1.age>ref2.age) {
				return 1;
			}
			return -1;
			
		};
		
		
		Collections.sort(arr2,cmp2);
		System.out.println(" Comparing based on age :"+arr2);
		
		//I can directly do this lambda expression inside the Collections.sort also
		
		Collections.sort(arr2,(student1 ref1,student1 ref2)->
		{
			if(ref1.id>ref2.id) {
				return 1;
			}
			return -1;
		}
		);
		
		System.out.println("Sorting directly inside the sort method :"+arr2);
				
				
				
				
				
				
				

		//I dont think we can compare with strings
//				Comparator<student1> cmp3=(student1 ref1,student1 ref2)->{
//					if(ref1.name>ref2.name) {
//						return 1;
//					}
//					return -1;
//					
//				};
//				
//				
//				Collections.sort(arr2,cmp2);
//				System.out.println(" Comparing based on age :"+arr2);

	}

}
