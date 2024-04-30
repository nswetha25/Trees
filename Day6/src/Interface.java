//By default inside the interface all methods are public and abstract
//100% abstraction is possible with interface
//In overriden methods u cant change return type in child class. it shold be changed first in parent class.
//By default if we use implemeents to extend in any child class by deafault the methods present in parent class will be inherited to child and they have 
//privide implementaion for sure. if they dont thenw ehave to make the child class also abstract
//we cant create object for interface but we can create the reference of interface. SO using the parent type reference which is Calculator we can access
//the overriden methods.  
// if I want to have non abstract methods in interface, means we can have body but need to give default keyworkd. so its mandatory to use.

interface  calculator{
	public  void add(); //public abstract void add()
	public void sub();
	int a=10;//by default it considered as public final static
	default void disp() {
		System.out.println("interface");
	}
	default void disp1() {
		System.out.println("interface 2");
	}
}
 class cal1 implements calculator{
	public  void add() {
		int a=5;
		int b=10;
		System.out.println(a+b);
		
	 }
	public void sub() {
		int a=52;
		int b=10;
		System.out.println(a-b);
		
	}
	 @Override
	//if I override or not use override keyword here and try to use the same method but I need to change the visibility to public for sure
	public  void disp() {
		System.out.println("child class");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculator.a);
		//calculator.a=20;//as it is by defualt final in the interface we cannot have any value.
		
		cal1 c=new cal1();
		c.add();
		c.sub();
		c.disp();
		c.disp();
		c.disp1();
		calculator cl=new cal1();
		cl.add();
		cl.sub();
		cl.disp();//If you create an instance of the implementing class and refer to it using a reference of the class type, then the overridden method in the class will be called.
		//If you create an instance of the implementing class but refer to it using a reference of the interface type, the overridden method in the class will still be called.
		cl.disp();
		cl.disp1();

	}

}
