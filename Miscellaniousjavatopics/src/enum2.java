
//Generaly based on the number of constants we have in enum we will have that many times the constructor gets printed
//we will have that class Result gets created which gets extended by enum automaticlaly in the backedn and that is when the object gets created in backend and calls 
//the constructor

//class Result extends Enum{}

enum Result{
	
	PASS, FAIL;
	//Here the below obj gets created in backend
	//public static final Result PASS= new Result();// that is the diff for every constant seperate set and get is being created so when I have only pass where 
	//i set and get marks it does not owkr for fail constat
	
	int marks=10; // we can have a normal variable also inside enum
	
	 Result() {
		System.out.println("constructor");
	}
	void setMarks(int marks) {
		this.marks=marks;
	}
	void getMarks()
	{
		System.out.println(marks);    //Inside enum we can have consturctor and getters and setters but without public access specifier
	}
	 
}
public class enum2 {

	public static void main(String[] args) {
		//
		Result.PASS.setMarks(40);
		Result.PASS.getMarks();
		//Now lets call getMarks using FAIL
		Result.FAIL.getMarks(); // As we did not use FAIL to set the marks and when I call getMarks it takes the defualt value which is initally 10 and print it
		

	}

}
