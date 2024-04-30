
//In Java, the toString() method is a special method that is automatically called when you try to print an object using System.out.println(), concatenate an object with a string, or in any other context where a string representation of the object is needed. This method is inherited from the Object class, which is the superclass of all classes in Java. By default, the Object class's toString() method returns a string that consists of the class name followed by the "@" character and the object's hash code in hexadecimal.

//In your Employee class, you have overridden the toString() method to return a string that contains the Employee object's name, age, and salary. This is a common practice to provide a meaningful string representation of an object.


class Employee{
	String name;
	 int age;
	 int salary;
	 public Employee() {
		 name="Sheru";
		 age=18;
		 salary=30000;
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(salary);
		 
	 }
	 
	public String toString() {
		return name+" "+age+" "+salary;
		//return "true";
	}
}
public class Inheritance6 {

	public static void main(String[] args) {
		Employee em= new Employee();
		System.out.println(em);
		

	}

}
