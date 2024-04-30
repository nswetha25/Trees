import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Launchst3 {

	public static void main(String[] args) throws IOException {
		
		try {
			//we have created a logical connection between java program and the path in our drive
			
			File dire=new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput");
			
			File file1=new File(dire, "tel.txt");
			
			//Lets pass the data for which we have to create some of the classes
			
			FileWriter fw=new FileWriter(file1,true);
			//Here whenever I run this program old data is not overriding it is keeping the old data and again printing the whole part
			fw.write("ava");
			fw.write("core java");
			fw.write(40);//Here its printing '(' ASCII value I guess
			
			char ch[]= {'a','b','c'};
			fw.write(ch);
			
			try {
				fw.close();
				System.out.println("Check the file");
			}
			catch(Exception e) {
				
			}
			
			
		}

		catch(Exception e) {
			
		}
		
	}

}
