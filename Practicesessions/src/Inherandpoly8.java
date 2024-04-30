//Here lets explore types of inheritance like Inherited methods, overriden methods and specialized methods
class prac14{
	public void show(){       // Inherited method. Did not change anything in parent
		System.out.println("prac12 inherited class");
	}
	public void disp() {
		System.out.println("overriden mthod prac12");
	}
}
class prac13 extends prac14{
	@Override
	
	public void disp() {
		System.out.println("overriden method prac13");      // Overriden method
	}
	public void spec() {
		System.out.println("specialized method");     // Specialized method present only in child class
	}
}
public class Inherandpoly8 {

	public static void main(String[] args) {
		prac13 p13=new prac13();
		p13.show();
		p13.disp();
		p13.spec();

	}

}
