// static methods do participate in inheritance but u can not override
//But if I have the same disp method in child class it will print the whatever present in it but it will not ovverride. basically if I use override
//it throws error. So what is happening here is it is hidin parent method. This concept is called Method hiding.So if we give static keyworkd in emethod
//it will not have nay issues
//Understand the difference between the methods with static keyword and without static keyword

class Demo1{
	static int a=10;
	public static void disp() {
		System.out.println("Parent class");
	}
	
}
class Demo3 extends Demo1{
	  // @Override
	//a=20;I cant have this again. I should create noew one int a
	public static void disp() {
		System.out.println("child class");
	}
	
	
}
class Demo6{
	public void disp() {
		System.out.println("Parent demo6 class");
	}
	
}
class Demo4 extends Demo6{
	   @Override
	
	public  void disp() {
		System.out.println("child demo4 class");
	}
	
}

public class Methodhiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d=new Demo3();
		d.disp();
Demo1 d1=new Demo3();
d1.disp();

Demo6 d3=new Demo4();
d3.disp();



	}

}
