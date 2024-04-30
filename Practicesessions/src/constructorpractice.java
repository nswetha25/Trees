// We know by default a non parameterized constructor is decalred by class when the object is created. But if we declare any kin of constructor 
//explicity then compiler will not decalre anyting. I thought of checking here what happens if after having parameterized constructor if I just create
//the object with out passing parameters at first. Its not allowing.

//Generally constructor is acting as setters. No replacement for getters
class practice2{
	String name;
	int age;
	public practice2(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
}
public class constructorpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice2 p=new practice2();
		practice2 p=new practice2("swetha",26);
		System.out.println(p.getage());
		
		

	}

}
