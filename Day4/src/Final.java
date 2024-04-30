// If I declare a class as final then I cant inherit it. But I can directly create a object for final class to access the members. Now if I remove the final
// from class and just give final before any method then we can inherit it. But I cant override the final method in child class
final class Human2{
	public void disp() {
		System.out.println("dsplaying");
	}
}
final  class Human3{
	public void disp() {
		System.out.println("static final");
	}
}
abstract class Human1{
	//final   void disp() ;// In abstract class I cant have final methods because for abstract methods implementation is necessary when we extend them
	 int age=28;
	
}
class Employee1 extends Human1{
//	public void disp() {
//
//		System.out.println("displaying");
//		
//	}
	 //super.age=18;
	
	
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee1 em=new Employee1();
//		em.disp();
//		System.out.println(em.age);
//		Human1 h=new Human1();
//		h.disp();
		Human2 hm =new Human2();
		
		hm.disp();

	}

}
 