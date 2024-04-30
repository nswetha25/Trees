// Here I have created constructors and extended only one class so when I just create the object itself I can see that it is first calling the
//parent class constructor as the super() method will be called by default inside the constructor and then print what is present inside the 
//constructor.
class prac10{
	public prac10() {
		System.out.println("prac8");
	}
}
class prac11{
	public prac11() {
		System.out.println("prac9");
	}
}
class prac12 extends prac11{
	public prac12() {
		//this();
		System.out.println("prac10");
	}
}
public class Inherandpoly5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac12 p12=new prac12();
		
		

	}

}
