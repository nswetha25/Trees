//Now ther are two types of relationships. HAS-A and IS-A . HAS-A comes under composition and then IS-A comes under one type of inheritance
class phone1{
	public void call() {
		System.out.println("calling");
	}
}
class Iphone extends phone1{      // IS-A relation
	
}

class human{
	public void show() {
		System.out.println("human");
	}
}
class Animal{
	human h=new human();       //HAS A relation
	public void show() {
		h.show();
		System.out.println("ANimal");
	}
}
public class inherandpoly7 {

	public static void main(String[] args) {
		Iphone ip=new Iphone();
		phone1 ip1=new Iphone();
		ip.call();
		ip1.call();
		Animal a=new Animal();
		a.show();
		

	}

}
