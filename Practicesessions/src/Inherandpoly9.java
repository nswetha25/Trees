// Here we have the same method name in both classes but in child class it is overriden. But if I want to call parent class method first then
// there is a way super.methodname . It can be just super() because the above method is not a consturctor and also we are not calling from a consturcto
// But when we create a constructor in parent class then eventhough we careate a object for parent class whic is extending child class it automatically
//checks for the constructor which is why it is printing "calling const"
class phone{
	public void call() {
		System.out.println("calling");
	}
	phone(){
		System.out.println("calling const");
	}
}
class iphone extends phone{
	public void call() {
		super.call();
		
		System.out.println("Iphone calling");
	}
}
public class Inherandpoly9 {

	public static void main(String[] args) {
		iphone ip=new iphone();
		ip.call();

	}

}
