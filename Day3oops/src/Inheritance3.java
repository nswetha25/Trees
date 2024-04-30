class A3{
	public A3() {
		this(5);
		System.out.println("in A");
	}
	public A3(int a) {
		System.out.println("inter a"+a);
	}
	
}
class B3 extends A3{
	public B3() {
		super();
		System.out.println("in B");
	}
	public B3(int a) {
	
		this();
		
		System.out.println("inter b");
	}
	
}

public class Inheritance3 {

	public static void main(String[] args) {
		B3 obj=new B3(6);

	}

}
