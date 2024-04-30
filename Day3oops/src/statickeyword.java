
public class statickeyword {
	 static int age=10;
static {
		System.out.println(age);
}
	//System.out.println(age);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age=20;
		System.out.println(age);
	}

}

class calc{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
