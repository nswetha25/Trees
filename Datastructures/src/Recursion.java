
public class Recursion {

	public static void main(String[] args) {
		
		Recursion r=new Recursion();
		r.f1();
		int result=r.fact(5);
		System.out.println(result);
	}
		public  void f1() {
			int i=0;
			System.out.println(i);
			//Recursion
			//f1();
		}
		
		public int fact(int i) {
			if(i<=1) {
				return 1;
			}
			else {
			return i * fact(i - 1);
			
			
		}
		
	
		

	

}
}
