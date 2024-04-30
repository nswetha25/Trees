//When u are asked about the question when to use Array and ArrayList, when u know the type of data and the size then go for array because it is fast.
package com.telusko.Learning;

import java.util.ArrayList;

public class LaunchGenerics {

	public static void main(String[] args) {
		//Typesafety
		String[] ar=new String[5];
		ar[0]="swetha";
		ar[1]="Nadella";
		ar[2]="test";
		
		String str1=ar[0];
		//we know everything present in collection is stored as Object
		ArrayList arrlist=new ArrayList();
		arrlist.add("swetha");
		arrlist.add("nadell");
		
		Object obj= arrlist.get(0);
		
		//But if I have to store this in string I have to downcast to string because everything in collection is stored as object
		//so if I have to perform any string related operations on that I have to convert to string like typecast to string and then perform any operations
		String s=(String) arrlist.get(0);
		
		System.out.println(s.toUpperCase());
		
		//Now here we wil add one more integer value to the arraylist and see how it behaves
		arrlist.add(10);//while adding to the array list it does not throw any error 
		String s1=(String) arrlist.get(2);
		//System.out.println(s1.toUpperCase());
		//Even while type casting to string I dont get any error for this int vlaue
		//But when I run this I get an exception "Java.lang.classcast exception because here we storing integer value and then we are tyring to find uppercase
		//which does not work. It is not throwing error during compile time but its trhwoing exception at run time which is not a good one. SO there is no
		//Type safety here.That is when they introduced the concept of Generics(from java 1.5)
		
		//But I noticed one thing if I save 10 as a string "10" then it does not throw any exception and gives the value 10 whatever the method I apply
		
		//Generics
		
		ArrayList<String> arrlist2=new ArrayList<String>();//with this generics it not only allows the datatype that we will be storing but we can directly access
		//the element instead of typecasting it. because while storing itself it is storing as String here
		arrlist2.add("swe");
		arrlist2.add("nad");
		System.out.println(arrlist.get(0));
		String s2=arrlist2.get(0);
		System.out.println(s2.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
 