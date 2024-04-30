//If I comment show method in C then the compiler willl confuse which method I have to choose whether it is from A or B. 
//For this we can use whch interface.super.methodname so ambiguity will be removed and it calls that particular method 
interface A{
	 default void show() {
		 System.out.println("A show");
	 }
 }
 interface B{
	 default void show() {
		 System.out.println("B show");
	 }
 }
 class C implements A,B{
//	 public void show() {
//		 System.out.println("C show");
//	 }
	 public void show() {
		 B.super.show();
	 }
 }
public class Interfaceambiguityissue {

	public static void main(String[] args) {
		C obj=new C();
		obj.show();
		
		C obj1=new C() {
			public void show() {
				System.out.println("ANony class");
			}
			
		};
		obj1.show();
		
		B obj2=new B() {
			public void show() {
				System.out.println("ANony class B");
			}
		};
		obj2.show();

		StringBuffer s=new StringBuffer();
	}

}
