// First I wrote how it wil behave without using any oops concepts like inheritance, abstraction,final , inheritance. Next I will comment and write below 
//using the above concepts

import java.util.*;
abstract class Shapes{
	float area;
	final float pi=3.14f;
	abstract public void input();
	abstract public void compute();
	public void disp() {
		System.out.println(area);
	}
	
	
}
class Rectangle extends Shapes{
	float length,breadth; 
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rect");
		length=sc.nextFloat();
		System.out.println("Enter breadth of rect");
		breadth=sc.nextFloat();
		}
	public void compute() {
		 area=length*breadth;
		
	}
	
}
class Square extends Shapes{
	float length;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter area of square");
		length=sc.nextFloat();
		
	}
	public void compute() {
		 
		area=length*length;
	}
	
	
}
class Circle extends Shapes{
	
float radius;

	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		radius=sc.nextFloat();
		}
	public void compute() {
		 area=(pi)*(radius*2);
		
	}
//	public void dp() {
//		System.out.println("dp");
//	}
	
}

// To achieve run time polymorphism I am writing one generic class based on the different obj references it is displaying
class Geometry{
	public void permit(Shapes ref) {
		ref.input();
		ref.compute();
		ref.disp();
		
	}
}
public class Projectwithandwithoutoops {

	public static void main(String[] args) {
		Geometry g=new Geometry();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		//c.dp();
		
		

	}

}

//import java.util.*;
//class Rectangle{
//	float length,breadth,area;
//	
//	public void input() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter length of rect");
//		length=sc.nextFloat();
//		System.out.println("Enter breadth of rect");
//		breadth=sc.nextFloat();
//		}
//	public void compute() {
//		 area=length*breadth;
//		
//	}
//	public void disp() {
//		System.out.println(area);
//	}
//}
//class Square{
//	float res,area;
//	public void input() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter area of square");
//		area=sc.nextFloat();
//		
//	}
//	public void compute() {
//		 
//		res=area*area;
//	}
//	public void disp() {
//		System.out.println(res);
//	}
//	
//}
//class Circle{
//	
//float result,radius;
//float pi=3.14f;
//	
//	public void input() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter radius of circle");
//		radius=sc.nextFloat();
//		}
//	public void compute() {
//		 result=(pi)*(radius*2);
//		
//	}
//	public void disp() {
//		System.out.println(result);
//	}
//}
//public class Projectwithandwithoutoops {
//
//	public static void main(String[] args) {
//		Rectangle r=new Rectangle();
//		r.input();
//		r.compute();
//		r.disp();
//		Square s=new Square();
//		s.input();
//		s.compute();
//		s.disp();
//		Circle c=new Circle();
//		c.input();
//		c.compute();
//		c.disp();
//		
//
//	}
//
//}
