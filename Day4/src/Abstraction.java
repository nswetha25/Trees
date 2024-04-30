// we can add abstract keyworkd to class and methods. We can not create objects for these abstract class but we can create references for the abstract class
// For this we will inherit it in child classes
abstract class Planes2{
	//abstract int age=10;// we cannot declare variable as abstract
	int age=20;
	abstract public void takeoff();
		
	 abstract public void Landing();
	 public void display() {
		 System.out.println("Welcome");
	 }
	 //An abstract can have a constructor and this will be invoked by using a super() in child class  constructor
	 //Also constructor cannot be abstract because every costructor willl default have super()
	 public Planes2() {
		 System.out.println("planes2 cons");
	 }
}
//class Cargos2 extends Planes2{ 
//	@Override
//	public void Landing() {
//		System.out.println("taking cargo");
//	}
//
//	@Override
//	public void takeoff() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//}
class Flights2 extends Planes2{
	public void Landing() {
		System.out.println("taking flight");
	}
	public void takeoff() {
		System.out.println("taking flights");
	}
	public Flights2() {
		super();
		System.out.println("flight cons");
	}
	
}
class Passengerplane2 {
	public void Landing() {
		System.out.println("taking passenger");
	}
	public void takeoff() {
		System.out.println("taking passengers");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cargos2 c=new Cargos2();
		Planes2 p;
		//p=c;
//		p.Landing();
//		p.takeoff();
//		p.display();
		Flights2 fl=new Flights2();
		
		

	}

}
