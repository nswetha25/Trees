class phone{
	public void call() {
		System.out.println("calling");
	}
	public void calling() {
		System.out.println("android");
	}
}
class Iphone extends phone{
	
	public void call() {
		System.out.println("calling iphone");
	}
	public void calling() {
		super.call();
		System.out.println("calling android");
	}
	public void calling1() {
		super.call();
		System.out.println("calling android 1");
	}
	
}
class pixelphone extends Iphone{
	public void call() {
		System.out.println("calling iphone");
	}
}
public class polydemo {

	public static void main(String[] args) {
		Iphone obj=new Iphone();
		phone obj1=new Iphone(); 
		phone obj2=new phone();
		// we can clearly see that we can create a super class reference and a subclass object
		obj.call();
		obj1.call();
		obj2.call();
		//super(obj.calling());
	obj1.calling();
		phone obj3=new pixelphone();
		//Iphone obj4=new pixelphone();
		obj3.call();
		obj3.calling();
		//obj3.calling1();
		Iphone obj5=new pixelphone();
		
	}
	

}
