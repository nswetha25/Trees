
public class Array4 {

	public static void main(String[] args) {
		int[] ar=new int[4];
		ar[0]=10;
		//ar[1]="swe"; Not possible because array stores only homogenous data which is of type int here
		//ar[4]=23;// Will get an run time error as Index out of bounds as the length is  4 but trying to insert element at 5thposition
		//Can create arrays for different types of data.Some examples below
		char[] c=new char[4];
		char[] c1= {'s','w','e'};
		char[] c2= new char[] {'s','w'};
		String[] s=new String[] {"Swetha Nade","Akhil"};
		System.out.println(s[1]);

	}

}
