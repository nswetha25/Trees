//An interface can not implement another interface but it can extend another interface. 
//A class can extend another class and implement an interface but the order is extends first and implements next
//Also we can implements more than one interface unlike extends in inheritance where only one class is extended once -- see below example
//Static Methods:

//You cannot access static methods in an interface through a reference variable of the interface type.
//You should call static methods using the interface or class name directly.
//Static Variables:

//You can access static variables in an interface using either the interface name or the implementing class name.
//Static variables are associated with the interface or class on which they are defined.
interface practice23{
	public void prac23();
}
interface practice24{
	public void prac24();
}
class practice25 implements practice23,practice24{
	public void prac23() {
	}
	public void prac24() {
	}
	
	
}
interface practice26 extends practice24{
	
}
class practice27 extends practice25 implements practice26{
	
}
//Marker interface/Empty interface
interface practice28{
	
}
//In interface we can have variables but by default it is  static final
interface practice29{
	float value=30.5f;//Bydefault it is final static float value
}
class practice30 implements practice29{
	public void disp() {
		
		System.out.println(value*value);
	}
}
public class Interfacepractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice30 p=new practice30();
		p.disp();
		System.out.println(p.value);
		System.out.println(practice29.value);
		

	}

}
