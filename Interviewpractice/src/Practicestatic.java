
public class Practicestatic {
	
	static int a=10;
	static {
		System.out.println("static block :"+a+10);//1010
	}
	
	public  static void disp() {
		
		System.out.println("static method"+a);
		
	}

	public static void main(String[] args) {
		
		System.out.println(a);//10
		Practicestatic.disp();

	}

}
