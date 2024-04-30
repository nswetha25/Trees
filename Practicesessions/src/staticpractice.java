
//As we can see below that before main method itself we are printing the values using static keyword. Because static does not require obj creation
//One important observation is that we know that static keyworkd can be used for vairblaes ,methods and blocks to print something without object and
//before main method. It can only print before main method without any invocation from static block.The static block is executed when the class is loaded into the memory, and it runs before the main method.
//But if I want to print what is present inside static method then I have to explicitly call it but without need of object .
public class staticpractice {
 static int a=10;
static{
	System.out.println(a);
}
static void disp() {
	System.out.println(a+10);
}
	public static void main(String[] args) {
		disp();
		// TODO Auto-generated method stub
a=30;
System.out.println(a);
	}

}
