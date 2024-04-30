// Gnerally we saw in lass Arrray2 that every array has same number of elements which is called regular arrya but in real world its not same.
//Eg each class will not have same number of students then we leave the second array empty. we call below as irregular array

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		//Jagged array
		int[][] arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of class"+i+"student"+j);
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Marks of student "+i+" "+j+" "+arr[i][j]);
			}
			System.out.println();
		}
		for(int[] a1:arr) {
			for(int a2:a1) {
				System.out.println("Marks of the student :"+a2);
			}
		}
	}

}
