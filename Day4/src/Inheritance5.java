class Human{
	protected int age;
	protected String name;
	public void display1() {
		System.out.println("parent class");
	}
}
class student extends Human{
	public void show() {
		age=10;
		name="sheru";
	}

}
public class Inheritance5 {

	public static void main(String[] args) {
		student st=new student();
		System.out.println(st.name);

	}

}
