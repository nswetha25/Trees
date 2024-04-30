//Using generics we can achieve type safety
package com.telusko.Learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Human{
	
}

class Learner extends Human{
	
	int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name+" "+age;
	}
	
	
}

public class LaunchGenerics2 {

	public static void main(String[] args) {
		Learner lr=new Learner();
		lr.setAge(25);
		lr.setName("swetha");
		
		Learner lr2=new Learner();
		lr2.setAge(28);
		lr2.setName("nadell");
		
		ArrayList al=new ArrayList();
		al.add(lr);
		al.add(lr2);
		al.add(12.5);
		
		
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		//To implement collection and to use the sorting I need to have only learner class not any other classes like adding the value above it throws error
		
//		Collections.sort(al, (Learner l1,Learner l2)->{
//			if(l1.age>l2.age) {
//				return 1;
//			}
//			return -1;
//			
//		};
		
		ArrayList<Learner> al1=new ArrayList<Learner>();
		//List<Learner> al1=new ArrayList<Learner>();// I can create parent type List reference also no issues
		//Collection<Learner> al1=new ArrayList<Learner>();//Having grand parent is also worsk
		Collection<Learner> al2=new ArrayList<Learner>();
		Collection<String> al3=new ArrayList<String>();
		//Collection<int> al4=new ArrayList<int>(); But having primitive type will not work. But how come it is accepting string? Need to check this
		
		al1.add(lr);
		al1.add(lr2);
		//al1.add(12.5);//See if I have used the generics concept then I cnat add that is outside the variables present
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		//System.out.println(al.get(2));
		
		Collections.sort(al1, (Learner l1,Learner l2)->{
			if(l1.age>l2.age) {
				return 1;
			}
			return -1;
			
		}
		);
		
		System.out.println(al1);
		
		//Also if I have a parent class which extends this Learner class and If I try to have that like below stmnt it doest not work in generics
		
		
		//List<Human> al5=new ArrayList<Learner>();
		
		

	}

}
