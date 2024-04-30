//Initial use of this keyword is to differentiate the local variable and instance variable. In the below as both are having the same name 'tech' its
//difficult to understnad for which it is assignmenin. If id ont use this here then compiler will think that we are assigning 'ython' for the local 
//variable itself and when I try to print the value of tech usong gettech method it will print the initla java. But if I give the this keyworkd
//it differentiates and compiler will understand we are assigning value to the instance variable and it updates accordingly
//Also here as we are declaring variable as private so to access this from outside the class we have to create the public getters andsetters
class practice1{
	private String tech="java";//If I dont give value here initally if I try to call gettech without setting the value then it gives null.
	private int age=10;//Eventhough its private if I want to access it direclty inside the class then no issues
	
	public void settech(String tech) {
		this.tech=tech;
		System.out.println(age);
	}
	public void gettech() {
		System.out.println(tech);
	}
}
public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1 p=new practice1();
		p.gettech(); //Before assignming the value we get java only
		p.settech("python");
		p.gettech();

	}

}
