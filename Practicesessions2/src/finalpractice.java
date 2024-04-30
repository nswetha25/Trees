//final keyword can be used for class, method and variable. We cannot extend final class but if we have a method as final and a class not as final
//then we can extend that but we cant overrride that method.we cannot have abstract and final as class at the same place because if i can declare
//variable as final in an abstract class
final class finalprac{
	public void disp() {
		System.out.println("displaying");
	}
	final int a=10;
	int b=20;
}
class finalprac1{
	final public void show() {
		System.out.println("showing");
	}
}
final class finalprac2 extends finalprac1{
	 public void showing() {
		 System.out.println("showoing finalprac2");
	 }

	
}
abstract class cn{
	final int age=40;
}

public class finalpractice {

	public static void main(String[] args) {
		finalprac p=new finalprac();
		p.disp();
		System.out.println(p.a);
		System.out.println(p.b);
		finalprac1 p1=new finalprac1();
		p1.show();
		finalprac2 p2=new finalprac2();
		p2.showing();
		

	}

}
