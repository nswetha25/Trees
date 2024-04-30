import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		//If I want to store while creating the array itself
		int[] a= {13,24,23,45,67};
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) { //Here length is a variable not method
			
		System.out.println("Enter the marks of student "+i);
		arr[i]=sc.nextInt(); 

	}
		System.out.println("Marks of students :");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(i +" is "+arr[i]);
//		
//		}
		for(int i:arr) {
			System.out.println("Marks of student are: "+i);
		}
		
	}

}
 