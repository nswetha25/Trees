//Understand the concept for below. Generally when I am creating without new keyword the memory for str1 will be allocated inside SCP. so a referece
//of it will be present and pointin to SCP. But when I have new keyword for str2 , the jvm whenever it sees the new ckeywrod it automatically creates object in
//heap area that is the reason first str2 will be created in heap area outside SCP and a reference is also created and it points to this heap area.
//But everytime when JVM sees a string it automaticlly creates one area to store in SCP. That is why str2 willhave one more memory crated in scp. 
//But the actual reference is outside heap area. So when I compare the str1.equals(str2) as it is comparing just the values i get true.
//But if I use str1==str2 where I am comparing the references and here the references are not pointing to the same location. one is pointing inside
//SCP and another outside SCP inside heap area I get false 
public class String3 {

	public static void main(String[] args) {
		String str1="Telusko";
		String str2=new String("Telusko");
		System.out.println(str1.equals(str2)); //comparing values
		System.out.println(str1==str2);//comparing references 

	}

}
