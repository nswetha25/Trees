// Here the sole purpose of supercar is to extend the car and change the behaviour . Instead of wasting the creation of whole new class for this
//we can directly change that after the obj creation
class car{
	public void drive() {
		System.out.println("driving");
	}
	public void drive1() {
		System.out.println("driving1");
	}
}
//Lets try for abstract class.so its working for abstract class. we have directly created object in the anonymous class below
abstract class supercar{
	abstract void drive() ;
		
	
}
//Now lets for interface
interface supercar2{
	void drive();
}

//class supercar extends car{
//	public void drive() {
//		System.out.println("driving supercar");
//	}
//}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		//c.drive();
		//below are also inner classes. As they dont have any name they are called anonymous inner class. But if I go and see the class files that is 
		//created now aloing with anonymous and car class there is one more class created Anonymous$1.class . so if create the same way one more object
		//and give those opening and closing braces then also one more class gets created Anonymous$2.class. So this particular class is overriding the
		//top class. If  I use override keyworkd then also it does not thoewr error
		
		car c1=new car() {
			@Override
			public void drive() {
				System.out.println("driving c1");
			}
			public void drive1() {
				System.out.println("asdfa");
			}
		};
		car c2=new car() {
			@Override
			public void drive() {
				System.out.println("driving c2");
			}
			//Here driving is not present in car so it cant print
//			public void driving() {
//				System.out.println("driving c3");
//			}
		};
		c1.drive();
		c1.drive1();
		c2.drive();
		c2.drive1();
		supercar superca=new supercar() {
			public void drive() {
				System.out.println("driving supercar");
	}

};
superca.drive();
supercar2 sp=new supercar2() {
	public void drive() {
		System.out.println("supercar 2 driving");
	}
};
sp.drive(); 
//There is one more shortcut for writing the above instead of writing like that. Below works only for interface. THis is a lambda expressio
//and this works only if I hve one method in my interface and we call it as functional interface. If Ihave more than one method I have to go
//traditonal aprrach like above
supercar2 object1 = () ->System.out.println(" super car driving");
object1.drive();



	}
}
