//we use this class for two dimensional array creation and accessing
//Here if I assign the values directly in the arr and if suppose in the first dimension I only gave 4 values and in second dimension if I give
//5 values then if I try to access the 5th elment in first dimension it gives array index out of bounds error
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		//To assign values directly in 2D
		int [][] ar= {{10,20,30,40,45},{23,23,12,23,24,45}};
		//System.out.println(ar[0][5]);
		
		
		
		
		int[][] arr=new int[3][5]; // Here we call it as 2D regular array because every array has same number of elements like first 3 arrays will have same 5 elements 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of class"+i+"student"+j);
				arr[i][j]=sc.nextInt();
			}
			
		}
		//Below is using normal loop
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Marks of student "+i+" "+j+" "+arr[i][j]);
			}
			System.out.println();
		}
		//Lets use enhanced for loop for printing. But this will not have info on the index of the elements. It just prints all the elements
		
		for(int a[]:arr) {
			for(int a1:a) {
				System.out.print("Marks of student :"+a1);
			}
			System.out.println();
			
		}
			}

}
