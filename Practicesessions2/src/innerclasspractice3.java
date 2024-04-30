//Here we are seeing anonymous class
class pracitce40{
	public void show40() {
		System.out.println("shwoing class 40");
	}
}
abstract class practice41{
	abstract public void show41();
	public void showing()
	{
		System.out.println("shwoing abstract");
	}
}
interface practice42{
	public void  show42();
	
}
interface practice43{
	public void show43();
	public void show44();
	default void show45() {
		System.out.println("show45");
	}
}
public class innerclasspractice3 {

	public static void main(String[] args) {
		pracitce40 p40=new pracitce40(){
			public void show40() {
				System.out.println("Anonmoys class p40");
			}
		};
		p40.show40();
		practice41 p41=new practice41() {
			@Override
			public void show41() {
				System.out.println("shwing 41");
			}
			@Override
			public void showing() {
				System.out.println("showing override");
			}
		};
		p41.show41();
		p41.showing();
		practice42 p42= new practice42() {
			public void show42() {
				System.out.println("show42 interface");
			}
		};
		p42.show42();
		practice42 p422=()->System.out.println("show p422 interface");
		p422.show42();
		practice43 p43=new practice43() {
			public void show43() {
				System.out.println("showing 43 interface");
			}
			public void show44() {
				System.out.println("shwoing 44 interface");
			}
		};
		p43.show43();
		p43.show44();
		p43.show45();

	}

}
