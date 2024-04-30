//Generally in overriden methods we can not have different return type. I will give an example below.see for class practice14 I have void for the 
//method as return type but if I use the same overriden method below and change the return type it is not accepting. But there is one scenario
//where it accepts the return type which is different from the parent. Called Covariant return type
//class Practice14{
//	public void show() {
//		System.out.println("showing");
//	}
//}
//class practice15 extends Practice14{
//	public String show() {
//		return "swetha";
//		System.out.println("showing prac15");
//	}
//}
class plane1{
	public void show() {
		System.out.println("plane1");
	}
}
class cargoplane1 extends plane1{
	@Override
	public void show() {
		System.out.println("cargoplane1");
	}
}
class passengerplane{
	public plane1 
}

public class covariantreturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
