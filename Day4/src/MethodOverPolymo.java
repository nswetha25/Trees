class Calc{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(int a,int b,double c) {
		return a+b+c;
	}
}
// Here during compile time itself compiler is resolving which method it is calling. Also called compile time polymorphism/ 
public class MethodOverPolymo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c=new Calc();
		c.add(5, 6);
		c.add(1, 2,3.5);
		c.add(2, 5,7);

	}

}
