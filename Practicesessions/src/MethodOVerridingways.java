//If we observe the below three types of inheritance is being used, Overriden methods, inherited methods and specialized  methods. 
class Animal1{
	public void eat() {
		System.out.println("Animal eating");
	}
}
class Monkey extends Animal1{
	@Override
	
	public void eat() {
		System.out.println("Monkey eating");
	}
	public void sleep() {
		System.out.println("Monkey sleeping");
	}
}
class deer extends Animal1{
	public void eat() {
		System.out.println("deer eating");
	}
	public void play() {
		System.out.println("deer sleeping");
	}
}
public class MethodOVerridingways {

	public static void main(String[] args) {
		Animal1 a= new Monkey();
		Animal1 a1=new deer();
		deer m=new deer();
		a.eat();
		a1.eat();
		m.play();

	}

}
