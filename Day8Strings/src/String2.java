
public class String2 {

	public static void main(String[] args) {
		String str1="telusko";
		String str2="telusko";
		String str3=new String("telusko");
		System.out.println(str1.equals(str2)); // Actual string object(value) will be compared. so here telusko will be compared
		String str4="swetha";
		String str5="Swetha";
		System.out.println(str4.equals(str5));// Here I just changed the first letter but java is case sensitive lang so it is giving false
		System.out.println(str4==str5);//references are compared. so here wha tis happening is both str4 and str5 is not using new keyword to create a
		//string and store the value. si it gets stored in string constant pool in the heap area. First str4 will be stored and its address is stored
		//in str4 . then heap mem will check fi the same value is already present in string constant pool as it will not allow duplicates. As the first
		//letter is differet case it creates one more memory and then assign that address to that str5. that is the reason it is gving false.
		
		//But below 2 lines as the case is also same in str1 and str2 it gives true for both statements.
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str2));

	}

}
