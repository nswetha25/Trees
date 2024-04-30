//WOrk on this

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		int[][][] stud=new int[2][][];
		stud[0]=new int[2][];
		stud[1]=new int[3][];
		stud[0][0]=new int[4];
		stud[0][1]=new int[3];
		stud[1][0]=new int[5];
		stud[1][1]=new int[3];
		stud[1][2]=new int[2];
		
		//Getting the data
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<stud.length;i++) {
			for(int j=0;j<stud[i].length;j++) {
				for(int k=0;k<stud[i][j].length;k++) {
				System.out.println("Enter the school "+i+"marks of class"+j+"student"+k);
				stud[i][j][k]=sc.nextInt();
			}
			}
		}
		
		for(int a[][]:stud) {
			for(int b[]:a) {
				for(int c:b) {
					System.out.print("Marks of every student present in class :"+c);
				}
				System.out.println();
			}
		}

	}

}
