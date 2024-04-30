// Based on teh number of objects created count should be displayed on the end
// If I am direct having int count then everytime object is created and called the constructor it creates a new count memory in the object and 
//increase the count. But if I print the count it shows only 1. But if I declare it as static then the count will not be initialized during object
//creation it gets initialized before that only so that the value will be keep on increementing outside the objects in the heap memory.
//so we make this count as class variable instead of object variable
//Next one more thing to remember is instead of having count inside these constructors u can have it in java initialization blocks so that whenever
//the object is created constructor wil be called and whenever the constructor is called then automatically before that this java initializaiton 
//block will be executed. so the order is before the main method itself static variables will be called and then static block wil be executed
//Next main method will be executed but if u want to execute the static method not static block u want to call explicitly . u can do that before object
//creation also using classname.staticmethodname or u can create using object refernece also. Then the object is created and the constructor will be
//called by default then once the constructor is called before executing the statements inside the constructor it will call the static block. then the constructor
//will be executed and then based ont he order in the main method other methdos and variables will be executed


class Demo2{
	int a,b;
	//int count;
	//static int count=2;
	static int count;
	{
		count++;
	}
	public Demo2() {
		//count++;
		
	}
//	public Demo2(int a, int b) {
//		//count++;
//	}
	public Demo2(int a,int b) {
		
	}
}
public class static3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d=new Demo2();
		Demo2 d2=new Demo2(2,3);
		Demo2 d3=new Demo2();
		System.out.println(d.count);
		

	}

}
