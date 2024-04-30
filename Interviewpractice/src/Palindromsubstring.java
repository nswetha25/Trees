import java.util.ArrayList;
import java.util.List;

public class Palindromsubstring {

	public static void main(String[] args) {
		String s="abbc";
		int n=s.length();
		List<String> ls=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				ls.add(s.substring(i,j));
			}
		}
		for(String s1:ls) {
			System.out.println(s1);
		}
	}

}
