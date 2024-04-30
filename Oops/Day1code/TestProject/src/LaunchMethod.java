class Calculator{
	int num1=20;
	int num2;
	int res;
	/*int add(int num1,int num2){
		//num1=a;
		//num2=b;
		res=num1+num2;
		return res;
	}*/
	void add() {
		int num1=10;
		res=this.num1+num2;
		System.out.println(res);
	}
}
public class LaunchMethod{
	public static void main(String args[]) {
		Calculator c= new Calculator();
		//int d=c.add(10,20);
		c.add();
		//System.out.println(d); 
		//System.out.println(c.add(20,30));
		
	}
}