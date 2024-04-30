//inn interface by default we can have methods with out implementaiton and the type will be public abstract. But if I want a normal public method 
//with implememtation I have to do two way : one is  having static keyword otherwise changing public to default. I have implemented both those methods
//below. I declared one public variable iniside interface right I can use directlyin the class that implements it.
//see as I have one static method in iinterface and the static method does not require any object so I can directly call that wiht class name.methodname
//Also if u see i can extend or say override the static method in the below child class. So I can call the static method anywhere with just classname.methodname
//But note that u cannot create instances/objects for an instance class so accessing static methods through creation of object is notpossible here
//When I directly gace p.subtraction() it is not accepting because of the following reason:
//The issue you're encountering is related to the fact that static methods in interfaces are not inherited by implementing classes. When you use the reference type of the interface (practice20 p;), you can only access the static methods defined in the interface itself, not those in the implementing class (practice21 in this case).

//In your code, when you try to call p.subtraction(), you're trying to access the static method subtraction() through the interface reference p, 
//which is of type practice20. However, the subtraction() method is implemented in the practice21 class, and static methods are not polymorphic 
//in Java. They are associated with the class or interface on which they are defined.
interface practice20{
	public void addition();
	public int a=30;
	public static void subtraction() {
		System.out.println("subtraction");
	}
	default void multiplication() {
		System.out.println(a*a);
	}
	default void division() {
		System.out.println("division");
	}
}
class practice21 implements practice20{
	public void addition() {
		System.out.println(a+a);	}

public static void subtraction() {
	System.out.println("subtraction in practice21");
}
public void multiplication() {
	System.out.println("multiplication in practice21");
}
}
public class Interfacepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice20 p;
		//p.subtraction(); //Not able to access it
		practice20.subtraction();
		practice20.subtraction();
		practice21.subtraction();
		p=new practice21();
		practice21.subtraction();
		p.multiplication();
		p.division();

	}

}
