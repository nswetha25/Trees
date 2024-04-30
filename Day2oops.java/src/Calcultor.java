class Cal{
	// Method Overloading where parameters can be diff or type of parameters can be different- compile time polymorphism
	
	public int add(int num1,int num2) {
		//int result=num1+num2;
		return num1+num2;
	}
	public int add(int num1,int num2,int num3) {
		int result=num1+num2+num3;
		return result;
	}
	public double add(double num1,double num2) {
		double result=num1+num2;
		return result;
	}
	
	public int add(double num1,double num2,double num3) {
		//double result=num1+num2;
		return (int) (num1+num2+num3);
	}
	public double add(int num1,int num2,int num3,int num4) {
		//double result=num1+num2;
		return  (num1+num2+num3);
	}
	public int add(int num1,double num2) {
		//double result=num1+num2;
		return  (int) (num1+num2);
	}
	public int add(int num1,double num2,double num3,double num4) {
		//double result=num1+num2;
		System.out.println("tesitng int to doubles");
		return  (int) (num1+num2+num3+num4);
	}
}
public class Calcultor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c=new Cal();
		int result=c.add(1, 2);
		int result2=c.add(2,3,5);
		double result3=c.add(2, 4,3,5);
		int result4=c.add(2.3,4.5,1.2);
		int result5=c.add(1,2.5);
		int result6=c.add(4, 3,4,5.5);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
		

	}

}
