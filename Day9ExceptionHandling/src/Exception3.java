import java.util.Scanner;
//below program I want my code to execute evenothough division part failed I want the array to be executed. so that is the reason I want try catch block to write the logic 
//seperately. And after the try block atlease one catch block related to that try should be present.

//One more observation I made here is lets say if I dont have the proper catch bock present after the try block and if I have it at the end then the below
//try block will not get exectured because JVM will go on checking the exception for that try block error and as it is present in the end it will execute ande 
//again it willnot come back to execute the another try blocks. so in the first try block if I have onlye one catch block ArrYIndexoutofbounds exception and if I have
//get an error about NegatvieArrayindexsize exception then it is present at the end so it goes and it will not print the other statmeents present in try block
//But if atleast geenric exception is present at the first try block then it gives that generic message and then print the try block . Run it to understand more
public class Exception3 {

	public static void main(String[] args) {
		System.out.println("connection is established");
		Scanner sc=new Scanner(System.in);
		
		try {
		       System.out.println("Enter the size of the arry");
		      
		       int size= sc.nextInt();
			   int arr[]=new int[size];
			   System.out.println("Enter element to enter");
			   for(int i=0;i<size;i++) {
			   int ele=sc.nextInt();
			   arr[i] = ele;
			   }
			   for(int i=0;i<size;i++) {
				   System.out.println(arr[i]);
			   }
				}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("array index out of bounds");
		}
		 catch(Exception e) {
	    	 System.out.println("Generic catch"); 
	     }
		
		try {
		
		System.out.println("Enter nominator");
		int num1=sc.nextInt();
		
	
		System.out.println("Enter denominator");
        int num2=sc.nextInt();
        
        int res=num1/num2;
        //Here once the exception occurs even if there are 100 stmnts after this it will not be executed
        System.out.println("result :"+res);
		}
		catch(ArithmeticException ae) {
			System.out.println("Invalid denomitor or invalid input type");
		}
//		try {
//       System.out.println("Enter the size of the arry");
//      
//       int size= sc.nextInt();
//	   int arr[]=new int[size];
//	   System.out.println("Enter element to enter");
//	   for(int i=0;i<size;i++) {
//	   int ele=sc.nextInt();
//	   arr[i] = ele;
//	   }
//	   for(int i=0;i<size;i++) {
//		   System.out.println(arr[i]);
//	   }
//		}
		//If I give generic exception whatever the error that we give in the try block it will only print one generic message. But if I want specific catch block exception to different
		//errors the we need to have different catch block whic has different exceptions
//		catch(Exception e){
//			System.out.println("Invalid input");
//			
//		}
		
		
//		catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println("array index out of bounds");
//		}
		catch(NegativeArraySizeException ae1) {
			System.out.println("please be in limits");
		}
		//this generic exception needs to be given to avoid any unanticpated errros and it should be present at the end only 
		//In the above code instead of giving interger value in aray if I give string then ther eis no eceptin that is being handled in the above so it goes to this generic excepiton only
		
//     catch(Exception e) {
//    	 System.out.println("Generic catch"); 
//     }
        System.out.println("connection is closed");


	}

}
