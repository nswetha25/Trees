import java.util.ArrayList;



import java.util.*;


public class Collectionspractice {

	public static void main(String[] args) {
		
		//Lets practice arraylist
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("swetha");
		System.out.print(al);// It gives the result as a List
		
		for(Object obj:al) {
			System.out.print(obj);//It just prints the values
		}
		
		Integer[] arr=new Integer[5];//Here if I declare a particular type of array i have to give the size of it
		
		ArrayList list4 = new ArrayList();
		list4.add("Hello");  // String
		list4.add(20);       // Integer
		list4.add(3.14);     // Double
		list4.add(true);     // Boolean
		list4.add('A');      // Character
		//list4.remove(3.14);
		
		////Using iterator also we can print the values and it is present in all classes
		Iterator it= list4.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Convert to an array of Object
//		Object[] arrayobj = list4.toArray();
//		for(Object obj:arrayobj)
//		System.out.println(obj);
		
		
		
		//Iterator it= list4.iterator();
		
	}

}
