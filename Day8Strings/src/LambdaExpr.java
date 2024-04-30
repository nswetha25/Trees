// 3 types of interface is presnet: Normal Interface, SAM Interface, Marker Interface
//Marker int - A interface which has 0 methods. THe reason we create this is 
//SAM interface is also called as functional interface which has only one abstract method basicaly and we can implement in short cut using lambda expression like below.


interface calc{
	public void show() ;
	default  void showing() {
		System.out.println("showing");
	}
}
//Lets uncomment the below class and lets implement the interface using anonymous inner class .
//class calcimp implements calc{
//	public void show() {
//		System.out.println("showing caclimp");
//	}
//}
public class LambdaExpr {

	public static void main(String[] args) {
		
//		calc c= new calcimp(); // Here I cant create the object for calc as it is an interface but I can do it for class calcimp and I can have
//		//the reference c created for calc 
//		c.show();
		calc c=new calc() {
			public void show() {
				System.out.println("showing anonymous");
			}
		};
		c.show();
		//we have seen this before while going through interface concept
		//Below lambda expression works only with the functional interface
   calc c1=() ->
		   
			System.out.println("interface");
		
		c1.show();
	

}
}