interface smartphone{
	public int converttoInr(int usd);
}
public class Lambdaexp3 {

	public static void main(String[] args) {
		smartphone sp=usd->(usd*82);
		System.out.println(sp.converttoInr(32));

	}

}
