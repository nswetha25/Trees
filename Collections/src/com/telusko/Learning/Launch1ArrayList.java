//All the below code is related to ArrayList collection type and its inbuilt methods
package com.telusko.Learning;

import java.util.*;


public class Launch1ArrayList {

	public static void main(String[] args) {
		//Now lets create the arraylist package coded by java team so we also import their package. Beacuse if I have normal array I can store only one specifi
		//type of data based on the declaration of the array
		
		ArrayList list=new ArrayList();
		
		//As we know that ArrayList implements List interface so we can create reference for List interface directly also
		List list1=new ArrayList();
		
		
		
		//If I use this reference I can see som many inbuilt methods coming with this ArrayList
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//I can store any type of data which is not possible in array and also I am storing dynamically
		
		list.add("swetha");
		
		//Also if I want to print whatever is there in my collection list I can directly use that reference variable but see the diff for normal array
		
		System.out.println(list);
		
		System.out.println("*****************************");
		
		List list2=new ArrayList();
		//Also here the order we are inserting is same as the order that is displaying . so order of insertion is preserved in the arraylist
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		System.out.println(list2);
		//see here based on the index I am performing inserting operation where the other elements automatically moved to the next indexes
		list2.add(1, 600);
		System.out.println(list2);
		//Adding one collection to another collection
		
		//list2.add(list); -- This will create like this [100,600,200,300,[10,20,30,40,swetha]]
		//System.out.println(list2);
		list2.addAll(list);//  [100,600,200,300,10,20,30,40,swetha]
		System.out.println(list2);
		
		System.out.println("*******************************");
		
		ArrayList list3=new ArrayList();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		
		System.out.println(list3);
		//list3.clear();
		System.out.println(list3.contains(30));//True
		System.out.println(list3.indexOf(30));//2
		System.out.println(list3.size());
		// Convert to an array of Integer
		Integer[] array = new Integer[list3.size()];
		list3.toArray(array);
		System.out.println("Arraylist of elements converted to array elements");
		System.out.println("list3 array elements :"+list3);
		for(int value:array)
		System.out.println(value);
		
		System.out.println("*****************************");
		//Lets say if I have array with diff types of elements then we will do with Object type
		ArrayList list4 = new ArrayList();
		list4.add("Hello");  // String
		list4.add(20);       // Integer
		list4.add(3.14);     // Double
		list4.add(true);     // Boolean
		list4.add('A');      // Character
		list4.remove(3.14);
		
		
		// Convert to an array of Object
		
		// Converts the elements of list4 to an array of Object. The toArray method returns an array containing all elements of the list in the correct order.
		//The type of the resulting array is an Object[], as the ArrayList can contain elements of different types.
		Object[] arrayobj = list4.toArray();
		
		System.out.println("Arraylist of different types elements converted to array elements");

		// Print the values from the array
		for (Object element : arrayobj) {
		    System.out.println(element);
		}
		
		// Creating and initializing the ArrayList with different types
        List<Object> arrayList = new ArrayList<>(Arrays.asList(10, "Hello", 3.14, true));
        
        //If I dont want to use Arrays.asList then I go for below also
        //List<Object> arrayList = new ArrayList<Object>() {{
//        add(10);
//        add("Hello");
//        add(3.14);
//        add(true);
//    }};

        // Printing the ArrayList
        System.out.println(arrayList);
		
		
		//System.out.println(list3);
		
		System.out.println("*******************************");
		//Normal array
		
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=5;
		arr[2]=8;
		for(int a:arr) {
			System.out.println(a);
		}
		//I am tryig to insert another element with in the index 1 but that element got replaced with this new value unlike moving to the next indices automatically
		arr[1]=9;
		for(int a:arr) {
			System.out.println(a);
		}
		
		
	}}

