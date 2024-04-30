//Enhanced for loop
import java.util.Arrays;
public class Array6 {

	public static void main(String[] args) { 
		int[] arr= {10,20,30};
		for(int a:arr) {  // It works for 1D array
			System.out.println(a);
		}
		int ar[][]= {{10,20},{30,40}};
		for (int a[]:ar) {
			for(int ele:a) {          // For 2D array 
				System.out.println(ele);
			}
		}
		//Generally we know we can create objects for only classes injava. Then we are creating objects for a array as we mentioned inintally that we
		//treat array as an object. Then where is the class? So to answer this question we will see below. Generally whenever the array object is created 
		//our program autonmoaticlly creates a array class.See it by printing the line below. Every arry will have getclass method and then we use the
		//getName method to see the name of the class.
		
		System.out.println(ar.getClass());
		System.out.println(ar.getClass().getName()); // 2d array : output is :   [[I
		System.out.println(arr.getClass());
		System.out.println(arr.getClass().getName());//1d array : output is :  [I
		
		int[] arra=new int[234234234]; //sometimes if there is no continuous space to allocate this large amount of size inmemory then we get an
		//error sayiing OutofMemoryError heap space area



int[] aa= {10,40,30,5};
System.out.println("Before Sorting");
for(int a:aa) {
	System.out.print(a+" ");
}
		Arrays.sort(aa); // So understand that to sort the data of array 'aa' we dont have any direct class to work with the data but we have an utility 
		//class available called Arrays where we can use it to sort the data present in the array which we have done the same. It is a static method
		//thats why u r calling directly with classname 
		System.out.println("After Sorting");
		for(int a:aa) {
	System.out.print(a+" ");
}
		

	}

}
