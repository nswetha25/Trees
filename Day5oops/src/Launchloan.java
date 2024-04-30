// In this basic program going to make some changes to make it efficeint. Here making PA,duration,SI static is not good because if I make static
//then memory will be allocated only once and for every object it will orride and then start the process. But Here ROI is common so we can make
//that as static so that the same copy can be shared to different objects.
//In Java, the static keyword is used to define class-level members, meaning they belong to the class itself rather than to instances of the class. When you declare a variable or method as static, it is shared among all instances of the class, and there is only one copy of that variable or method for the entire class.
// Below example of when not to use static and also when to use static is explained.

import java.util.*;
class Farmer{
//	 static float PA;
//	 static float duration;
//	static float ROI=2.5f;
//	 static float SI;
	  float PA;
	  float duration;
	static float ROI=5.5f;
	static {
	System.out.println("Hi");
	}
	  float SI;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prin amount");
		PA=sc.nextFloat();
		System.out.println("Enter time duration");
		duration=sc.nextFloat();
		//ROI=2.5f;
		
	}
	public void compute() {
		SI= PA*duration*ROI/100;
	}
	public void disp() {
		System.out.println("SI is: "+SI);
	}
	
}

class Farm{
	public void cal(Farmer f) {
		f.input();
		f.compute();
		f.disp();
	}
}
public class Launchloan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Farmer f1=new Farmer();
Farmer f2=new Farmer();
Farmer f3=new Farmer();
Farm f=new Farm();
f.cal(f1);
f.cal(f2);
f.cal(f3);
f1.disp();
f2.disp();
f3.disp();



	}

}
