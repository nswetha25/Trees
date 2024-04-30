import java.util.*;
public class Inheritance {

	public static void main(String[] args) {
		System.out.println("Enter value a and b");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();		
		Multiple cal= new Multiple();
		cal.add(a, b);
		cal.sub(a, b);
		cal.mul(a, b);

	}

}
