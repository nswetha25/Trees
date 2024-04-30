class phone1{
	public void callingfromphone() {
		System.out.println("calling phone");
	}
}
class Iphone1 extends phone1{
	//Hey compiler my intention is to override the above method
	@Override
	public void callingfromphone() {
		super.callingfromphone();
		System.out.println("calling");
	}
}
public class Annotationexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone1 ip=new Iphone1();
		ip.callingfromphone();

	}

}
