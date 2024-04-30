
public class mutablestring {

	public static void main(String[] args) {
		// Creating mutable strings
		StringBuffer sb1=new StringBuffer("Telusko");
		System.out.println(sb1);
		//Generally if I am not using stringbuffer and tyring to use concat method to directly use the reference varibale concatenating with another 
		//stirng then it will not print the whole word. But here it is pringting the whole word because the string is mutable
		sb1.append("Bengaluru");
		System.out.println(sb1); //TeluskoBengalurur
		
		
		//StringBuffer sb2="Telusko"; Not possible to declare StringBuffer like this
		
		StringBuilder sb2=new StringBuilder("Swetha");
		sb2.append("nade");
		System.out.println(sb2);
		
		//To check the capacity
		StringBuilder sb3=new StringBuilder();
		
		System.out.println(sb3.capacity());// Default capacity is 16
		
         StringBuffer sb4=new StringBuffer();
		
		System.out.println(sb4.capacity());//Def capcacity is 16
		
		sb3.append("Swetha Nadella");
		System.out.println(sb3.capacity());
		sb3.append("is studying java fundamentals");
		System.out.println(sb3.capacity());
		StringBuffer sbb=new StringBuffer();
		sbb.append("sweth");
		System.out.println(sbb.capacity());
		
         StringBuffer sb5=new StringBuffer("Sachin");//16+6-- Default is 16
         System.out.println(sb5.capacity());
         
         //Below we are getting sb6.equals(sb7) as false becasue every class has by default object as parent class. In that parent object class we have 
         //method equals which compares the references. But in stringbuilder and stringbufferr there is no equals method written to override it unlike 
         //string class. so it compares the references and as the references are not equal here means not pointing to the same location we get false.
         //But this equals method is overriden in String class that is the reason we are getting for this because in stirng class they are comparing values
         
         StringBuffer sb6=new StringBuffer("sachin");
         StringBuffer sb7=new StringBuffer("sachin");
         System.out.println(sb6.equals(sb7));  //false
         //To compare the values (contents) of StringBuffer or StringBuilder objects, you need to convert them to String objects first and then use the equals() method of the String class. Here's how you can do it:
         
         boolean areEqual = sb6.toString().equals(sb7.toString());
         System.out.println("Are StringBuffer contents equal? " + areEqual);//true

         //TO compare values we have another method here. Do that as assignment on how to compare the values
         System.out.println();
         
         String sb8="Sachin";
         String sb9="Sachin";
         System.out.println(sb8.equals(sb9));//True
         
         boolean areEqual1 = sb8.toString().equals(sb9.toString());
         System.out.println("Are StringBuffer contents equal? " + areEqual1);

         
         String sb10=new String("Sachin");
         String sb11=new String("Sachin");
         System.out.println(sb10.equals(sb11));//true
		
		
		
		
		

	}

}
