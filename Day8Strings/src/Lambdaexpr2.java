//Different ways of writing lambda exp when we have some parameter. we can create lambda exp only for functonal inteface. You can use a annotaion 
//to mention functionalinterface so that it avoids anyone to write any extra method
@FunctionalInterface
interface phone{
	int square(int num);
}
public class Lambdaexpr2 {

	public static void main(String[] args) {

		phone p=new phone() {
			public int square(int num) {
				return num*num;
			}
		};
		
		//A lambda expression which is a replaceemnt for the above it wil not create any new class again. It willl include in the main method//.
		//Ithelps ot reduce number of lines and helps to manager class files
		
		System.out.println(p.square(5)) ;
		
		phone p1=(int num)->{
			return num*num;
		
		};
		System.out.println(p1.square(6));
		
		//But if we have two values passing through parameters then for sure we have to use brackets(num1+num2) 
		phone p2=num-> num+num;
		
		System.out.println(p2.square(7));
		
		
		
	}

}
