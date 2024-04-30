import java.util.HashMap;

public class interviewprac1 {

	public static void main(String[] args) {
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		String s="abcdcaf";
		for(int i=0;i<s.length();i++) {
			if(!hash.containsKey(s.charAt(i))) {
			
					hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
				
				
			}
			
		}
		for(char key:hash.keySet()) {
			if(hash.get(key)==1) {
				return 1;
			}
			
			
		}
		return -1;
	}

}
