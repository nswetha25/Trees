
public class Stringinbuiltmethods {
	public static void main(String[] args) {
		String str="Telusko";
		str=str+"Bengaluru";
		
		System.out.println(str ); //TeluskoBengaluru
		
		//Here if I add final to this str1 it behaves like a constant. so even the reference can also hold only one variable and we cannot change it.
//		final String str1="Telusko";
//		str1=str1+"xy";
//		System.out.println(str1);
		
		String st1="Swetha Nadella";
		System.out.println(st1);
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println(st1.charAt(2));
		System.out.println(st1.substring(1, 4));//its like start from 1 and end at 3 dont include 4
		System.out.println(st1.substring(4));
		System.out.println(st1.contains("w"));
		System.out.println(st1.indexOf("h"));
		System.out.println(st1.length() );
		System.out.println(st1.trim());
		System.out.println(st1.startsWith("s") );
		//Here if i want to print all the chars in the string I have to loop through it
	    char ch[]=st1.toCharArray() ;
	    for(char c:ch) {
	    	System.out.println(c); 
	    }
	    //Here I have to split wherever "a" is there and print so need to store it first in Stirng [] and then iterate through the loop
	    String[] a=st1.split("a") ;
	    for(String a1:a) {
	    	System.out.println(a1);
	    }
	    
	    
		
	}

}
