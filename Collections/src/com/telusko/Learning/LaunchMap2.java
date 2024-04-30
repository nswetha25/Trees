package com.telusko.Learning;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.*;



public class LaunchMap2 {

	public static void main(String[] args) {
		

		//HashMap<Integer,String> map1=new HashMap();//can create like this also
		//Lets create generic one
		
		HashMap map1=new HashMap();
		map1.put(1, "virat");
		map1.put(2, "virat");
		
		map1.put(3, "virat");
		System.out.println(" Direct map values and keys :"+map1);
		
		//Unlike collection we dont have iterator in Map hierarchy
		
		//So there is a way to fetch the values. so there is a method in map called values which has the type of collection. And we can use iterator for this collections
		
		System.out.println(" map values :"+map1.values());//[virat, virat, virat]
		
		Collection col=map1.values();
		
		Iterator itr=col.iterator();
		
		while(itr.hasNext()) {
			//System.out.println("Iterating with values :"+itr.next());// Here only values we get
			//Lets say instead of direclty printing I have to perform some oepratios on this values and I know the values persent in our map is String type. And evertyhgin
			//is present in object so I will type cast to string
			String str=(String) itr.next();//If I use generics no need to typecast as we alredy mention that while declaration itself
			System.out.println("Values to upper case :"+str.toUpperCase());
			
		}
		
		//But if we want only Keys then there is a seperate method for it
		
		System.out.println("Directly getting values from map :"+map1.keySet());
		//Instead of directly geting the keys from map we can store it in Set becasue the return type of keysset is set as it has unique values and then iteraor is
		//present in set 
		
		Set s=map1.keySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext()) {
			//System.out.println("Iterating with keys :"+it.next());
			//Now lets take the keys which is of integer type and apply some operation
			Integer ite=(Integer)it.next();
			System.out.println("Key is :"+ite);
			
		}
		
		//Iterating with both keys and values
		
		System.out.println("Both key and values from map "+map1.entrySet());
		
		//But to use iterator for accessing the values I see that entrySet return the Set as return  type and so I can use this
		
		Set s1=map1.entrySet();
		Iterator it2=s1.iterator();
		while(it2.hasNext()) {
			System.out.println("iterating through keys andv alues :"+it2.next());
		}
		//See int he above program we are directly printing the keys and values but I want them to be stored in their data types and then apply any methods like above
		//But we know entrySet has both diff types of data present so we cant just store it in one type. But we have an iinterface entry present inside interface map
		//which we can use it store diff type of keys and values
		Set s2=map1.entrySet();
		Iterator it3=s2.iterator();
		while(it3.hasNext()) {
			Map.Entry pair=(Entry) it3.next();//As Entry is the inner interface of map I have to write like this
			System.out.println(pair.getKey()+" "+pair.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
