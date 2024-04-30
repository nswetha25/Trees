//Lets discuss printwriter now

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Launchst6 { 

	public static void main(String[] args) throws FileNotFoundException {
		
		File dire=new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput");
		
		File file1=new File(dire, "tel.txt");
		
		//Using filewriter and filereader we can only work with character but if I want to work withother type of data
		PrintWriter pw=new PrintWriter(file1);
		
		pw.write(65);
		pw.println("Java");
		pw.println('a');
		pw.println(43.6);
		
		pw.close();//I did not use this initally and in my tel.txt nothing got printed
		
		
		

	}

}
