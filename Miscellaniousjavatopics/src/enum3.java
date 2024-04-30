
enum Results{
	PASS,FAIL;
}
public class enum3 {

	public static void main(String[] args) {
		int i=10;
		String s="JAVA";
		//As we are creating switch for these data types we can have for enum also
		switch(s) {
		
		}
		
		Results res=Results.PASS;
		switch(res) {
		case PASS: System.out.println("passed the exam");
		break;//If I dont use this all the cases below this gets executed once it is true
		case FAIL: System.out.println("failed the exam");
		}

	}

}
