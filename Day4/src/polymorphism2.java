class Planes{
	public void takeoff() {
		System.out.println("taking");
	}
	public void Landing() {
		System.out.println("landing");
	}
}
class Cargos extends Planes{ 
	@Override
	public void Landing() {
		System.out.println("taking cargo");
	}
	public void takeoff() {
		System.out.println("taking cargos");
	}
	
}
class Flights extends Planes{
	public void Landing() {
		System.out.println("taking flight");
	}
	public void takeoff() {
		System.out.println("taking flights");
	}
	
}
class Passengerplane extends Planes{
	public void Landing() {
		System.out.println("taking passenger");
	}
	public void takeoff() {
		System.out.println("taking passengers");
	}
	
}
// Below is one type to achieve run time polymorphism by having extra class
/*class Airport{
	public void permit(Planes p) {
		p.takeoff();
		p.Landing();
	}
}
public class polymorphism2 {

	public static void main(String[] args) {
		Cargos cg=new Cargos();
		Flights fl=new Flights();
		Passengerplane pp=new Passengerplane();
		Airport a=new Airport();
		a.permit(cg);
		a.permit(fl);
		a.permit(pp);
		
		
		

	}

}*/
// Next I am not creating any new class instead of it I am directly using super class refernece created inside the main method and use it directly
public class polymorphism2 {

	public static void main(String[] args) {
		Cargos cg=new Cargos();
		Flights fl=new Flights();
		Passengerplane pp=new Passengerplane();
		Planes p;
		p=cg;
		p.Landing();
		p.takeoff();
		p=fl;
		p.Landing();
		p.takeoff();
		p=pp;
		p.Landing();
		p.takeoff();
	}
}
		