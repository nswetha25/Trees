// Here we can have differnt types of constructors as shown. Initally based on the object creation it calls the specified constructor. But there are
//two possibilities this() and super() present as the first line in the constructors. If I dont mention anyting then by defualt super() will be present 
//and this will be used to call parent class constructor as there is no parent class here , every class by default will have object class as parent
// But if I specify this() it means it tells the compiler explicitly involkes the zero parameters constructor of the existing class. If I give
//any parameters then it invokes that constructor particularly.
class practice4{
	String name;
	int age;
	public practice4() {
		System.out.println(("swetha nadella"));
		System.out.println("Zero parametized constructor");
		
		
	}
	 practice4(String name,int age){
		this();
		//this("swetha Nadella"); cant have more than one this() in a constructor
		this.name=name;
		//return name;
		
	}
public String	practice4(String name){
		this.name=name;
		//System.out.println(name);
		return name;
	}
	public void getName() {
		System.out.println(name);
	}
}
public class constructorpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice4 p=new practice4("Swetha",34);
		p.getName();

	}

}
