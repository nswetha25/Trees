//All these diff annotations already the java team has writen some code so when I use this it is being sent to the compiler and the compiler behaves as per the code
//The @Deprecated annotation in Java is a way to indicate that a method, class, or field should not be used anymore, as it might be removed in future versions or it has better alternatives. This annotation serves as a warning to developers but does not prevent the deprecated elements from being used or executed. When you mark something with @Deprecated, it still functions as normal, but the annotation acts as a flag for developers to know that they should look for or use alternatives.



@Deprecated
class plane1{
	
	public void flightheight() {
		System.out.println("plabe fligs");
	}
	
}
@Deprecated
class autoplane1 extends plane1{
	
	@Override
	public void flightheight() {
		System.out.println("cargo plane fligs");
	}
}
public class Annotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		plane1 p=new autoplane1();
		p.flightheight();
		plane1 p2=new plane1();
		p2.flightheight();

	}

}
