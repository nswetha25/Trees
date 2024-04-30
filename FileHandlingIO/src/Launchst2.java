import java.io.File;
//To establish a connection between our java program and hard disk there are many inbuilt IO files written by Java team so that if I use them I can directly store these in my harddisk

public class Launchst2 {

	public static void main(String[] args) {
		
		try {
			//Here inside the InputOutput folder I dont have tel.txt file if it is not there then it will create the file
			File file1=new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput/tel.txt");
			
			//Instead of writing the while process below lets directly create the file
			
			//file1.createNewFile();
			//Lets uncomment this as it is working as expected
//			if (file1.exists()) {
//                System.out.println("File already exists.");
//            } else {
//                // Create the new file
//                if (file1.createNewFile()) {
//                    System.out.println("File created successfully.");
//                } else {
//                    System.out.println("File creation failed.");
//                }
//            }
			
			//Lets create a folder Tel below
			
			File directory= new File("/Users/swethanadella/Desktop/JavaPractice/InputOutput/Tel");
			//To check if a folder exists or not
			System.out.println(directory.exists());
			directory.mkdir();//It will create a directory
			System.out.println(directory.exists());
			
			//Lets try diff methods
			
			System.out.println(directory.isDirectory());//True
			
			System.out.println(directory.createNewFile());//False beacsue this is a directory we are creating 
			
			//Now lets try to print all the files present in collections 
			
			
			
			File file2= new File("/Users/swethanadella/Desktop/Javacodes/Collections/src/com/telusko/Learning");
			String str[]=file2.list();
			
			for(String st:str) {
				System.out.println(st);
			}
			
			
		}
		
		catch(Exception e) {
			System.out.println("Not able to create the file");
			
		}
		
	}

}
