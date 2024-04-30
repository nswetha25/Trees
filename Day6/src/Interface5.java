// Here as one class is inside another class we can create an object inside the outer class for the inner class and then access it. But i cant create
//object for inner class in the main method and access it. EVen I go and see the class files that are created once we compile we can see three class
//files got created and the inner class will have demointer$demointer1.
//To create the object of inner class inside the main method we need the outer class object. We can create outclass.innerclass as reference .see below
//Generally the concept of inner class is when we want someoperation to be done specifically only for one class then we go. But generally we dont use it anywhere much
//we can create many inner classes I guess but we have follow in below way.
//we have three types: Member inner class, static inner class and anonymous inner class
class demointer{
	
	demointer1 dm1=new demointer1();
	//dm1.show();
	public void show() {
		//dm1.show();
		System.out.println("in demointer show");
		dm1.show();
	}
	class demointer1{             //Member inner class
		public void show() {
			System.out.println("in demointer1 show");
		}
		class demointer2{
			public void show() {
				System.out.println("in demointer2 show");
			}
		}
	}
}

public class Interface5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demointer dm=new demointer();
		dm.show();
		//demointer1 dm1=new demointer1();
		demointer.demointer1 obj1=dm.new demointer1();
		obj1.show();
		demointer.demointer1.demointer2 obj2=obj1.new demointer2();
		obj2.show();
		

	}

}
