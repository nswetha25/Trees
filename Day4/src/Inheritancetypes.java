// Inherited Method, Overriden method and specialized method of inheritance
class Plane{
	//private variables cannot participate in inheritacne
	private int a=10;
	int b=20;
	//constructor do not participate in inheritance but they get executed bec of super method
	public Plane() {
		System.out.println("plane constr");
	}
	public void takeoff() {
		System.out.println("taking");
	}
	public void Landing() {
		System.out.println("landing");
	}
}
class Cargo extends Plane{ 
	Cargo(){
		super();
	}
	@Override
	public void Landing() {
		System.out.println("taking cargo");
	}
	public void test() {
		System.out.println("testing cargo");
	}
}
class Flight extends Plane{
	public void Landing() {
		System.out.println("taking flight");
	}
	public void test() {
		System.out.println("testing flight");
	}
}

public class Inheritancetypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p=new Plane();
		
		//p.test(); Specialized method cant be accessed if it is not present in its class
		Cargo cg=new Cargo();
		cg.Landing();
		cg.test();
		cg.takeoff();
		System.out.println(cg.b);//As this varible is not private I can access it
		//cg.Plane();//constructor is gving error when trying to access in inherited methods
		Flight fl=new Flight();
		fl.Landing();
		fl.test();

	}

}
