class A{
	
	public A() {
		System.out.println("A class");
	}
	
	public A(int a) {
		System.out.println("A param "+a);
	}
}

class B extends A{
	
//	public B() {
//		this(12);
//		System.out.println("B class");
//	}
	public B(int a) {
		
		System.out.println("param b"+a);
	}
}
public class Practiceconstrucotchaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B ref=new B(10);

	}

}
