
public class aboutstatic {
	static int a;
	static {
		a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("main method");
		a=20;
		System.out.println(a);

	}

}
