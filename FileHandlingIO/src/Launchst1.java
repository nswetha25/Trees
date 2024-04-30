import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Here we are trying to acheive serialization - to securely store the data
//see for below Seriablizable is an interface and generally we know that when we implement an interface we need to implement its method but this 
//particular interface has no methods and we call it as Marker Interface. JVM will give the implementation to this interface at run time so our object will be stored
//securely in the file and developer will not have any work. But in reality JVM will provide the implementation at run time directly.


//The need for ObjectInputStream is not specific to any operating system; it's related to the fact that you are serializing an object using ObjectOutputStream. Whenever you use ObjectOutputStream to serialize an object, you need ObjectInputStream to deserialize it.

//The process of serialization involves converting an object into a byte stream, and the resulting file may not be human-readable or editable using a text editor. This is why trying to open it as a text file might lead to encoding errors.

//The ObjectInputStream is responsible for reading the byte stream and reconstructing the original object. The code I provided is essential for deserializing the object, and it is not tied to any specific operating system.
class student implements Serializable{
	
	//WHenever we use this Serializable object behind the scenes a seriable obj is created. To deconstruct it they need to have the same class in this case 
	//student should be used
	
	//Explore Serialize version and deserializable version
	private static final long serialVersionUID = 1L;
	private int id;
	 private String name;//Using transient keywork we can make sure that these members will not participate in serialization
	private int age;
	
	public student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
		
	}
	public void disp() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		
	}
	public String toString() {
		
		return id +" "+name+" "+age;
	}
	
	
}
public class Launchst1 {

	public static void main(String[] args) {
		
		try {
			
			//I am commmentibg to check the deserialization object
//		student st=new student(1,"swetha",28);
//		//System.out.println(st.toString());
//		
//		st.disp();  // Generally if the  main program completes execution then this object is collected by GC but now I dont want that to happen so lets see how 
//		//acheive that in this. we will have stream classes for that purpose
//		
//		FileOutputStream fos=new FileOutputStream("/Users/swethanadella/Desktop/JavaPractice/InputOutput/tel.txt");
//		//To crush my entire object in to streams I will use the below line
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		
//		oos.writeObject(st);
//		
//		oos.close();
		
		//Lets do deserialization object. so whatever the object that is serialized and kepr in the file we are deserializing it
			
			
		
		FileInputStream fis=new FileInputStream("/Users/swethanadella/Desktop/JavaPractice/InputOutput/tel.txt");
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		student s=(student) ois.readObject();
		
		s.disp();

System.out.println("Deserialization successful!");
		
		ois.close();
//		
		
		
		
		
		
		} 
		
		catch(Exception e) {
			 e.printStackTrace();
		}
		

	}

}
