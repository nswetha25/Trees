import java.util.ArrayList;
import java.util.List;

class Human{
	
	public void sleep() {
		System.out.println("Human sleeping");
	}
}

class Student extends Human{
	@Override
	public void sleep() {
		System.out.println("student is sleeping");
	}
	
	
}
public class LaunchGen3 {

	public static void main(String[] args) {
		
		//As per oplymorphism parent type can store child typre reference
		
		Object obj=new Object();
		String str="java";
		obj=str;
		
		Human hm=new Human();
		Student st=new Student();
		hm=st;
		
		
	ArrayList human=new ArrayList();
	//human.add(10);will not allow
	//human.add(new Student());will allow
	
	ArrayList std=new ArrayList();
	
	human=std;
	
	ArrayList<Human> hmn=new ArrayList<>();
	
	ArrayList<Student> stud=new ArrayList();
	
	//hmn=stud; Here in generics parent type can not store child type reference unlike the above. But we can achieve this using wildcards in generics
	
	//Here type of data doesnot matter
	
	ArrayList<?> hum=new ArrayList();
	
	ArrayList<Student> stdnt=new ArrayList();
	
	hum=stdnt;
	
	//One more concept called upper bound and lower bound
	
	
ArrayList<? extends Human> hum1=new ArrayList(); // Upper bound. It can be any child ref of Human or human
	
	ArrayList<Student> stdnt1=new ArrayList();
	
	//ArrayList<String> stdnt1=new ArrayList();we cant do this because string is not child of human
	
	hum1=stdnt1;
	
	
	ArrayList<? super Human> hum2=new ArrayList();// lower bound either or upper hierarchy of human
	
	ArrayList<Student> stud2=new ArrayList();// student is child of human not parent hence the error
	
	//hum2=stud2;
	
	ArrayList<Object> stude3=new ArrayList();
	hum2=stude3;
	
	callSleep(hmn);
	
	}
	
	public static void callSleep(List<Human> list) {
		
		
	
	
	
	// This is such a boring topic if u want listen to this once
	
	
	
	
	
	
	

	}

}
