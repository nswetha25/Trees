package com.telusko.Learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Information{
	private int age;
	private String name;
	private String city;
	public Information(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return  name+""+age+" "+city;
	}
}
public class Launchmap3 {

	public static void main(String[] args) {
		
		Information inf=new Information(22,"swetha","US");
		Information inf1=new Information(23,"Nadella","CA");
		Information inf2=new Information(24,"akhil","IN");
		
		HashMap hm=new HashMap();
		
		hm.put(1, inf);
		hm.put(2, inf1);
		hm.put(3, inf2);
		

		//Lets say I will take the info from the user and if he is valid user then I will print the values for his id
		System.out.println("Enter your id for the info");
		Scanner sc=new Scanner(System.in);
		
		Integer in=sc.nextInt();
		
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		boolean flag=false;
		
		while(it.hasNext()) {
			Map.Entry entry=(Entry) it.next();
			Integer k = (Integer)entry.getKey();
			
			if(k==in) {
				flag=true;
				System.out.println("Value for your id:"+entry.getValue());
			}
//			else {
//				System.out.println("you are an invalid user");
//			}
			
			
		}
		if(flag==false)
		System.out.println("Not a valid id");
		
		

	}

}
