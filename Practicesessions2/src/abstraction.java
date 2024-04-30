//If I have atleast one method as declared abstract then for sure I need to declare class also as abstract.  I cannot create object for abstract class
//but I cancreate references.Lets say If I am extending that abstract class I have to provide implementation for all the abstract methods otherwise
//I have to declare that class also as abstract. Also we can have a constructor if we want in the abstract class. Bydefault the constructor will be
//declared by the compiler and it will not be abstract because by derault constructor will have the first statemetn as super()
abstract class practice16{
	public void disp() {
		System.out.println("displaying");
	}
	abstract public void show();
	public practice16() {
		System.out.println("constr");
	}
}
class practice17 extends practice16{
	public void disp() {
		System.out.println("displaying practice17");
	}
	public void show() {
		System.out.println("shwoing");
	}
	public void displaying() {
		System.out.println("displaying childclass");
	}
}

public class abstraction {

	public static void main(String[] args) {
		practice16 p;
		practice17 p17=new practice17();
		p=p17;
		p.disp();
		p.show();
		p17.displaying();
	}

}
