class A1{
	
public	final int a=10;
	
}

class B1 extends A1{
	
	public void disp() {
		System.out.println(a);
		
	}
}
public class Practiceinherandpoly {

	public static void main(String[] args) {
		
		B1 obj=new B1();
		obj.disp();
		
	}

}
