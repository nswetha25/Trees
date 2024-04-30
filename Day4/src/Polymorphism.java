//Method Overriding
class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void running() {
		System.out.println("Animal is running");
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("tiger hunts and eats ");
	}
	public void running() {
		System.out.println("Tiger is running");
	}
	
}
class Monkey extends Animal{
	public void eat() {
		System.out.println("Monkey hunts and eats ");
	}
	public void running() {
		System.out.println("Monkey is running");
	}
	
}
class Deer extends Animal{
	public void eat() {
		System.out.println("Deer hunts and eats ");
	}
	public void running() {
		System.out.println("Deer is running");
	}
	

}
class Forest{
	public void permit(Animal ref) {
		ref.eat();
		ref.running();
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		/*Tiger t=new Tiger();
		t.eat();
		t.running();
		Monkey m=new Monkey();
		m.eat();
		m.running();
		Deer d=new Deer();
		d.eat();
		d.running();*/
		Tiger t=new Tiger();
		Monkey m=new Monkey();
		Deer d=new Deer();
		Forest f=new Forest();
		f.permit(t);
		f.permit(m);
		f.permit(d);

	}

}
