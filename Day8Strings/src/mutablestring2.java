
public class mutablestring2 {

	public static void main(String[] args) {
		//See here the final keyword is not affecting the mutablility of the reference sb1. but in string class it did not allow to create
		final StringBuffer sb1=new StringBuffer("Swetha");
		sb1.append("Tendulkar");
		System.out.println(sb1);
		//final has no impact on mutability of stringbuffer object it will impact the reference of an object not the actual mutable object 
		
		//sb1=new StringBuffer("xy"); Here while I am creating another object for the same reference variable then it is not allowing
		
		//but if I dont use final keyworkd then I can use the same reference for other object
		
		
		
		StringBuffer sb2=new StringBuffer("Swe");
		sb2.append("nad");
		System.out.println(sb2);//Swenad
		
		sb2=new StringBuffer("che");
		System.out.println(sb2);//che
		
		String sb3=new String("Swe");
		sb3.concat("nad");
		System.out.println(sb3);//Swe
		
		sb3=new String("che");
		System.out.println(sb3);//che 
		
		

	}

}
