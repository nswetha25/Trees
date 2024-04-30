//Before we saw about the comparator interface now in this class lets see the comparable interface
//Before when we are using comparator there is no necessity to make the target class which is student1 in our case accessible to us. Means we are not changing
//anything in the target class
//But when we are using comparable we are supposed to make the target class accessible

//If the target class is accessible then we can go for Comparable otherwise we will go with Comparator
package com.telusko.Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student2 implements Comparable<student2>{
	 String name;
	 int age;
	public int id;
	
	public student2(String name, int age,int id) {
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


	public student2(int age) {
		name="swetha";
		this.age=age;
		id=4;
		
	}
	
	public student2() {
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
@Override
public int compareTo(student2 ref1) {
	if(this.age>ref1.age) {
		return 1;
	}
	return -1;
}
	
}

public class LaunchComplex3{
	
public static void main(String[] args) {
		
		student2 st1=new student2();
		student2 st2=new student2(18);
		student2 st3=new student2("swe",8,3);
		
		ArrayList arr=new ArrayList();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		
ArrayList<student2> arr2=new ArrayList();
		
		arr2.add(st1);
		arr2.add(st2);
		arr2.add(st3);
		
		Collections.sort(arr2);
		System.out.println("sorting based on age :"+arr2);
		
		
		
		
}
}