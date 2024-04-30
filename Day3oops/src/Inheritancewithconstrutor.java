class A1{
	public A1(int a) {
		System.out.println("constructor A");
	}
	public void show() {
		System.out.println("show A");
	}
}
class B1 extends A1{
	public B1(int b) {
		super(b);
		System.out.println("constructor B");
		
		System.out.println(b);
	}
//	public void show() {
//		System.out.println("show B");
//	}
}
class C1 extends B1{
	public C1(int a) {
		super(a);
	System.out.println("constructor c");
}
}
public class Inheritancewithconstrutor {

	public static void main(String[] args) {
		C1 obj= new C1(5);
		obj.show();
	}

}
