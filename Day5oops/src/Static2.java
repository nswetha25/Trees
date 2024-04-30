// Here first static block will be executed as it does not require any object creation. Then if you want u can directly call any static methods
// without using object so it will execute the stmnts present in it. Once it is done then we u create an object we know constructor willb e invoked when 
//we create an object by default but here even if constructor is there or not if will first call java initialization block before constructor
// and then print the constructor if necessary. Once all these static blocks and non static block is done then with the help of object reference
// we will be calling the necessary methods using the obj reference. If I dont want to call static methods then no need to call we can directly create an object

class Demo{
	static int a,b;
	int x,y;
	static {
		a=10;
		b=20;
		//x=15;//we can only access static variables in static blocks
		System.out.println(a);
		System.out.println(b);
		System.out.println("static block");
	}
	// Non static block/java initializatinblock// instance initialization block.//
	//Behind the scenes this static block/ java initialization block will be executed before consturctor.
	{
		x=10;
		y=22;
		a=33;// but we can access static variables everywhere
		System.out.println("Non static block/java initialization block");
	}
	public Demo() {
		
			x=50;
			y=62;
			System.out.println(x);
			System.out.println(y);
		
		System.out.println("constructor");
	}
	public static void disp() {
		a=30;
		b=40;
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		
	}
	public void disp2() {
		x=55;
		y=45;
		
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
	}
}
public class Static2 {

	public static void main(String[] args) {
		Demo.disp();
		Demo d=new Demo();
		System.out.println(d.x);
		d.disp2();
		d.disp();
		System.out.println(Demo.a);
		System.out.println(d.x);
		//d.disp();

	}

}
