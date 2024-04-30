import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class trywithresc {

	public static void main(String[] args) {
		
		//FileWriter fw=null;
		
		//here it w ill auto close without us closing the resoruces explicitly - we call with try with resources
		//Instead of using finally  block we can use this try with resources also
		
		//so when we use these directly insed the try block then they will auto close the resources once it is completed. Lets see the next pgm 
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("/Users/swethanadella/Desktop/JavaPractice/InputOutput/telusko.txt"))) {
			
			//File dire=new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput");
			
			//File file1=new File(dire, "tel.txt");
			
			//fw=new FileWriter(file1,true);
			
			bw.write("java");
			bw.newLine();
			bw.write(56);
			

	}
		catch(Exception e) {
			
		}
		
	}
	

}
