//Here return stmnt is dominated by finally so first it comes to try and have value 10 but after that it is replaced by 1000
class test{
	public static int alpha() {
		try {
			return 10;
		}
		catch(Exception e) {
			return 100;
		}
		finally {
			return 1000;
		}
	}
}
public class Exception8 {

	public static void main(String[] args) {
		int res=test.alpha();
		System.out.println(res);

	}

}
