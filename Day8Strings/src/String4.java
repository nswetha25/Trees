//See here I am using new keyword to create the memory space directly in the heap area first so the references will be pointing to the respective memory
//areas. Even though I have the same name in heap area it will not check for duplicates that is the reason we get two copies unlike SCP where we have
//only one copy if we have the same value but have two reference variables pointing to the same. 
public class String4 {

	public static void main(String[] args) {
		String str1=new String("Telusko");
		String str2=new String("Telusko");
		System.out.println(str1.equals(str2)); // It checks the values and gives true
		System.out.println(str1==str2);// It checks the references and both ref wil be pointing to diff memory locations as they are created in heap area 
		//and it gives false
		 
		
		String st3="Telusko"; 
		String st4="Telusko";
		System.out.println(st3.equals(st4)); // It checks the values and gives true
		System.out.println(st3==st4);//True
		
		String st5="Telusko"; 
		String st6="telusko";
		System.out.println(st5.equals(st6)); // It checks the values and gives false as case sens
		System.out.println(st5==st6);//false
		System.out.println(st5.equalsIgnoreCase(st6));//As we are ignoring the case we get true
	}
	

}
