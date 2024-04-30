//Lets see BufferWriter and BufferWriter which helps to avoid harddisk hits and increase the performace

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Launchst5 {

	public static void main(String[] args) {
		try {
		
		File dire=new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput");
		
		File file1=new File(dire, "tel.txt");
		
	
			FileWriter fw=new FileWriter(file1,true);
			
			
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("Java pgm");
			bw.newLine();
			bw.write("python");
			
			
			//Lets read the content present in the file using bufferedreader
			
			FileReader fr=new FileReader(file1);
			
			BufferedReader br=new BufferedReader(fr);
			
			String data=br.readLine();
			while(data!=null) {
				System.out.println(data);
				data=br.readLine();
				
			}  
			 System.out.println();
			 fr.close();
			 br.close();
			 
			 fr=new FileReader(file1);
			 br = new BufferedReader(fr);
			 String data1;
			 while((data1=br.readLine())!=null) {
				 System.out.println(data1);
			 }
					
			
			
			
			bw.flush();//Before closing we are flusing all the data
			bw.close();
			fw.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
