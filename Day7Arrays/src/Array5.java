// Here we created a student array with 3 places. Each place will have an object created to store the name and age of student. There is diagram in the book
//refer to it. After creating a seperate object if I want to assign name and age we can assign based on the obj created 
class Student{
	int age;
	String name;
}
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] ar=new Student[3];
		ar[0]=new Student();
		ar[1]=new Student();
		ar[2]=new Student();
		ar[0].name="swetha";
		ar[0].age=23;
		ar[1].name="Akhil";
		ar[2].name="Jyothi";
		System.out.println(ar[0].name);

	}

}
