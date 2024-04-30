//Here lets practice about static inner class
class practice37{
	public void show37() {
		System.out.println("showing practice37 parent class");
	}
	public void show372() {
		System.out.println("shwing 372");
		
	}
	static class practice38{
		public void show38() {
			System.out.println("shwoing 38");
		}
		public void show372() {
			System.out.println("shwoing 372 child static");
		}
	}
}
public class Innerclasspractice2 {

	public static void main(String[] args) {
		practice37 p37=new practice37();
		p37.show37();
		p37.show372();
		practice37.practice38 obj= new practice37.practice38();
		obj.show38();
		obj.show372();
		

	}

}
