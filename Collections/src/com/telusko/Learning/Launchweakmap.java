package com.telusko.Learning;

import java.util.HashMap;
import java.util.WeakHashMap;

class emp4{
	int id;
	String name;
	public emp4() {
		id=2;
		name="swetha";
		
	}
	public String toString() {
		return name+" "+id;
		
	}
	@Override
	public void finalize() {
		//Inside this method there is so much code written already for the prupose of cleaning the object which GC calls
		System.out.println("GC of objec"); //Generral in my main method I am not caling this finalize method but when we call System.gc it automatcially checks for 
		//finalize methoda nd we ahve overriden the finalixe method we are able tos ee this msg on the screen
	}
}
public class Launchweakmap {

	public static void main(String[] args) {
		emp4 emp=new emp4();
		//System.out.println(emp.toString());
		//HashMap hm=new HashMap();
		//hm.put(1, emp);
		//System.out.println(hm);//Here once I create hashmap and then I go and assign emp as null which has an object in my heap area witout anyref but I dont see the 
		//msg of "GC of object" present in finalize method which means the GC did not exectue the finalize method becasue hashmap dominates the GC. Because GC will think
		//that even though this object is referenceless it is give once to hashmap so it will not touch it.This is the reason they have introduce one hashmap called 
		//weakhashmap. Here stil it is not printing. He said that the behaviour changed even after weakhashmap GC is not calling finalzie method
		WeakHashMap whm=new WeakHashMap();
		//whm.put(1, emp);
		whm.put(emp, 1);//but having this emp in keys then it is calling finalize method
		System.out.println(whm);
		
		emp=null; //Now I changed the address of emp from emp4 to null. so emp4 present in heap area is eligible for GC to collect
		System.gc();//way to invoke gc manually
		
		System.out.println(emp);

	}

}
