import java.io.File;
import java.io.FileReader;

public class Launchst4 {

	public static void main(String[] args) {
		
		try {
			
			File dire=new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput");
			
			File file1=new File(dire, "tel.txt");
			
			//Lets see how to read the data from the file
			
			FileReader reader=new FileReader(file1);
			
			//Below will read only one character in the file
//			int i=reader.read();//It gives decimal representation of the particular character
//			
//		    System.out.println(i);
//		    
//		    System.out.println((char)i);
//		    
//		    reader.close();
			
			//But if I want to read all the characters in the file1 then I have to loop through it until the end of the file
			
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
				
			}
			//If I dont close and reopen it then it is not printing anything
			//Move to a new line for better separation of outputs
            System.out.println();

            // Close and reopen the FileReader
            reader.close();

            // Reopen the FileReader for the second loop
            reader = new FileReader(file1);
			
			//One more way of writing this is like below
			char ch[]=new char[(int)file1.length()];//Here file1.length return type is long becasue we can crores of lines but char array can only accpet size which is of type int
			
			reader.read(ch);
			for(char c:ch) {
				System.out.println(c);
			}
			
			//But above it goes character by character so the number of hard disk hits are more here. It should go to harddisk for every character and print it which is not a good practice
			//so to avoid this we can make use of Buffer locations. 
			
			
			
			
			
			
			
			
		}
		catch(Exception e) {
			
		}
	}

}
