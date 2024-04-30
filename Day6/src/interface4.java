// Here we can have methods with definitions and it is not compulsory to override them in the child class,. It works either ways.
//Having no access specifier which is considered default is different from this default in interface
//From java 8 we can have static  methods inside the interface. But htis static method can not overide in child class. we have seen the similar
//concept in method hiding. I mean it acts a new one because if I try to use override method then it is shwoing the error. But if we use
//this @Override keyword then it is throwing error for static method which clearly says that it is not accepting.
// Also observer one more thing using classname.staticmethod we can invoke that static method as static does not require any
//object

//Unlike interface static methods, static methods in abstract classes can be inherited by subclasses. However, they cannot be overridden like instance methods. If a subclass defines a static method with the same signature, it hides the parent class's static method rather than overriding it.

interface draw{
	void disp();
	default void display() {
		System.out.println("displaying");
	}
	public static void staticmethod() {
		System.out.println("static method");
	}
}
class drawing implements draw{
	@Override
	public void disp() {
		System.out.println("disp in child class");
	}
	@Override
	public void display() {
		System.out.println("display in child class");
	}
	// @Override
	
	public static void staticmethod() {
		System.out.println("static method child class");
	}
}
public class interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawing d= new drawing();
		d.disp();
		d.display();
		d.staticmethod();
		draw dw=new drawing();
		dw.disp();
		dw.display();
		draw.staticmethod();

	}

}
