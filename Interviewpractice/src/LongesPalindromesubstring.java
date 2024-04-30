//Here we are doing brute force appraoch for longes palindrome substring. First we will take each substring and pass it to the palindrome functiona dn then check and return if it
//is palindrome and have string where I check if that is the longest length till now. If yes I update it to the longest palindrome and goes on. At the end I return the longest
//palindrome


class isPalindrome{
	public static boolean ispalin(String str) {
		
		//here we take the string and check if it is palindrome or not
		
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			return true;
		}
		return false;
		
	}
	
	
}

public class LongesPalindromesubstring {

	public static void main(String[] args) {
		String s="aabced";
		//After taking the string I want to take each substring to pass it to the class isPalindrome.
		//Also lets have any empty string to check longest palindrome
		String longpalind="";
		int len=s.length();
		for(int i=0;i<len;i++) {
			for(int j=i;j<=len;j++) {
				String str=s.substring(i, j);
				boolean res=isPalindrome.ispalin(str);
				if(res&&str.length()>longpalind.length()) {
					longpalind=str;
				}
				
				
			}
		}
		System.out.println(longpalind);
		
		

	}

}
