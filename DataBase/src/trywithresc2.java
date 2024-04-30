//Here lets see by having a class which implmeents AutoCloseable and it has the close method present by default inside it
//In your code, you are using the try-with-resources statement to automatically close the resource (test object) when the block is exited. The test class implements the AutoCloseable interface, which has the close method. The try-with-resources statement automatically calls the close method on the resource when the try block is exited, whether it is exited normally or due to an exception.
class test implements AutoCloseable{
	
	public void close() {
		System.out.println("resources closed");
	}
}
public class trywithresc2 {

	public static void main(String[] args) {
		
		try(test t=new test()){
			System.out.println("res opoend");// Here after printing this behind the cscenes that cloase is being called implicitly beacuse we have the interface
			//implemented 
		}

	}

}
