package com.telusko.Learning;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Animal{
	int age;
	String name;
}

public class LaunchMap {

	public static void main(String[] args) {
		
		HashMap map1=new HashMap();
		//instead of add we have put
		
		//Her eit will not allow duplicates but if I try to insert one more with the smae key it is not throwing error but it will override
		//Also I notiecd it is not maintaining the order of insertion but I believe its coming in ascending order based on keys but need to confirm. so its said
		//that no one knows how the data is stored in which order in hashmap
		
		map1.put(6, "swetha");
		
		map1.put(2,"swetha");// Here the type of key and value is Object
		
		map1.put(3,"nadella");
		map1.put(null,"nadella1");
		map1.put(null,"nadella2");
		map1.put("swetha","nadella");
		
		System.out.println(map1);//{1=swetha, 2=swetha, 3=nadella}
		
		Animal a=new Animal();
		map1.put(a, "Tiger");//{1=swetha, 2=swetha, com.telusko.Learning.Animal@7e774085=Tiger, 3=nadella, swetha=nadella}
		
		map1.put(6, a);
		System.out.println(map1);//{1=swetha, 2=swetha, com.telusko.Learning.Animal@7e774085=Tiger, 3=nadella, swetha=nadella, 6=com.telusko.Learning.Animal@7e774085}
		
		//hashtable was legacy class later they added to map
		Hashtable ht=new Hashtable();
		
		ht.put(3,"nadella");
		//ht.put(3, null);Not allowing for values also
		//ht.put(null,"nadella1");// Will not allow null and it gives null pointer exception for hash table
		
		System.out.println(ht);
		
		//But LinkedHashMap maintains the order of insertion unlike HashMap

		LinkedHashMap map2=new LinkedHashMap();
		map2.put(2, a);
		map2.put(1, a);
		map2.put(5, a);
		
		System.out.println(map2);
		
		//Like treeset , this treemap will sort the data based on the key value
		TreeMap tm=new TreeMap();
		tm.put(2, a);
		tm.put(1, a);
		tm.put(5, a);
		
		System.out.println(tm);
		
		
		
	}

}
