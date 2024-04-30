class prac5{
	int age;
	String name;
	public prac5() {
		name="Swetha";
		age=10;
	System.out.println("Zero param constructor");
	System.out.println(age);
	}
	public void agedisp() {
		System.out.println(age);
	}
}
class prac6 extends prac5{
	prac6(){
		System.out.println("parent class cons");
	}
	prac6(int ag){
		age=ag;
		System.out.println(age);
	}
	public void disp() {
		System.out.println(name);
	}
}
public class Inheritandpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac6 p=new prac6();
		prac6 p1=new prac6(34);
		p.agedisp();
		p.disp();
		p1.agedisp();
		

	}

}
