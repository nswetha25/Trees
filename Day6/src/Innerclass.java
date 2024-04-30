//Generally a class cannot be static but a inner class can be static
//To access it we dont want to use top class obj.new we can directly new outerclass.innerclass
//Generally only member of a class can be static . so technically here inner class is a member of the outer class.so it is allowed to declare static
class innercl1{
	
	
	public void show() {
		//dm1.show();
		System.out.println("in demointer show");
		
		
	}
	static class innercl2{             //static  inner class
		public void show() {
			System.out.println("in demointer1 show");
		}
	}
}

public class Innerclass {

	public static void main(String[] args) {
		innercl1 cl1=new innercl1();
		cl1.show();
		innercl1.innercl2 obj=new innercl1.innercl2();
		obj.show();
		

	}

}
