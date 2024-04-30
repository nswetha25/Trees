// A class can extend and implement but the order matters. First the class should be extends and then it should implements
interface demo{
	float pi=3.14f; // Behid the scenes this is considered as public final static float pi=3.14f
	void add();
}
class demo1{
	void disp() {
		System.out.println("demo1");
	}
	public void add() {
		System.out.println("demo1 class");
	}
	public void sub() {
		System.out.println("sub");
	}
	
}
class demo2 extends demo1 implements demo{
	public void add() {
		
		System.out.println("demo2 class");
		
	}
}
public class interface3 {

	public static void main(String[] args) {
		
		demo d=new demo2();
		d.add();
		demo1 d1=new demo1();
		d1.add();
		demo1 d11=new demo2();
		d11.add();
		d11.sub();
		//demo.pi=4.5f;
		System.out.println(demo.pi);;
		

	}

}
