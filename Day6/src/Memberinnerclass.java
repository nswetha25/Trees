// Here if I want to create object for inner class then one wayis to create inside the memclass and it worked. Now lets uncomment it and then
//start creating object outside the class which is directly in Memberinnerclass. If I directly create object of iner class ift will not be able to
//find the inner class memclass1 as it is inside memclass. Also if we see class files we can see three different class files created for this pg,
//that is including the inner class
class memclass{
	//memclass1 obj=new memclass1();
	
	public void disp()
	{
		System.out.println("in memclass");
		//obj.disp();
	}
	class memclass1{
		public void disp() {
			System.out.println("in memclass1");
		}
	}
}

public class Memberinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		memclass obj=new memclass();
		obj.disp();
		//To create the object of inner calss we need the object of outer class
		memclass.memclass1 obj2=obj.new memclass1(); 
		obj2.disp();
		
		
	}

}
