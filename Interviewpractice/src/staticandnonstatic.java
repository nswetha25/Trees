import java.util.Arrays;
import java.util.List;

class A3{
	
	public static void disp() {
		System.out.println("static method A");
	}
}


class B3 extends A3{
	
	public static void disp() {
		System.out.println("static method B");
	}
}
public class staticandnonstatic {

	static int a=10;
	int b=20;
	static {
		System.out.println("a "+a);
		//System.out.println("b "+b);;
	}
	{
		System.out.println("java block :"+b);
	}
	public static void main(String[] args) {
		
		
		B3.disp();
		A3.disp();
		
		B3 obj=new B3();
		
		System.out.println(obj.getClass().getName());
		
		int[] a=new int[5];
		System.out.println(a.getClass().getName());
		
		List<Integer> a1= Arrays.asList(2,3,4);
		//a1.add(5);
		//for(int a2:a1)
		System.out.println(a1);
		
		

	}

}
