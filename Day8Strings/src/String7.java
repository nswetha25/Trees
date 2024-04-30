
public class String7 {

	public static void main(String[] args) {
		//whenever we try to concatenate anything with string it will not preform any manipulations it if they start with string
		String str1="Telusko"+144+34;
		System.out.println(str1);//Telusko14434
		
		//But here first the integerpart is concatenated right so we get 112Swetha
		String str2=100+12+"Swetha";
		System.out.println(str2 );//112Swetha
		
		String str3=123+"Swetha"+34;
		System.out.println(str3);// 123Swetha34
		
		String str4=123.45+"Swetha"+34;
		System.out.println(str4); //123.45Swetha34
		
		String str5=123+"Swetha"+'r';
		System.out.println(str5); //123Swethar
		
		String str6=120/5+"Swetha"+34;
		System.out.println(str6);   //24Swetha34

	}

}
