
public class String5 {

	public static void main(String[] args) {
		String st1="telusko";
		String st2="Telusko";
		//System.out.println(st1.compareTo(st2));
		int res=st1.compareTo(st2);//ouput is 32 -- see explaination in notes. Here it compareslexicographically which means in decimal values of ASCII
		// Here the first character itself is diff right so it wil not compare others. 't' will have vlaue 116 and 'T' value 84 so it gives'32' if I have
		//reverse first st1 as"T" and st2 as "t" then it gives -32 when I print the result directly
		System.out.println(res);
		if(res==0) {
			System.out.println("strings are equal"); 
		}
		System.out.println(res==0); //false
		
		

	}

}
