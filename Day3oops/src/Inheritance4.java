class p{
	int num=9;
	public void show() {
		System.out.println("showing");
	}
	
}
class q extends p{
	public q() {
		super();
		System.out.println("example" );
		// System.out.println(num);
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
		q obj=new q();
		obj.show();

	}

}
