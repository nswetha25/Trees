import java.util.LinkedList;
public class linklist {

	public static void main(String[] args) {
		// we have inbuilit linkedlist class with various methods inside where we can import it and use them
		LinkedList nums=new LinkedList();
		nums.add(5);
		nums.add(9);
		nums.addFirst(10);
		//Here unlike arrays where if we specify the index it will not go directly to the index to fetch the element.it tracks between the elemnts. so it is time consuming as it dont have
		//any index values. 
		System.out.println(nums.get(1));
		System.out.println(nums);
		//to get head element in one more way use peekmethod
		System.out.println(nums.peek());
		
		
		
		
	}

}
