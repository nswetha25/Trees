class A{
	public A() {
		System.out.println("constructor A");
	}
	public void show() {
		System.out.println("In show A");
	}
}
class B extends A{
	public B() {
		System.out.println("constructor B");
	}
	public void show1() {
		System.out.println("In show B");
	}
}
class C extends B{
	public C() {
		System.out.println("constructor C");
	}
	public void show() {
		System.out.println("In show C");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		C obj=new C();
		A obj1=new A();
		obj.show();
		obj.show1();
		obj1.show();

	}

}
