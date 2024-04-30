import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("connection is established");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nominator");
		int num1=sc.nextInt();
		
	
		System.out.println("Enter denominator");
        int num2=sc.nextInt();
        
        int res=num1/num2;
        //Here once the exception occurs even if there are 100 stmnts after this it will not be executed
        System.out.println("result :"+res);
       
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
		//If I give generic exception whatever the error that we give in the try block it will only print one generic message. But if I want specific catch block exception to different
		//errors the we need to have different catch block whic has different exceptions
//		catch(Exception e){
//			System.out.println("Invalid input");
//			
//		}
		
		catch(ArithmeticException ae) {
			System.out.println("Invalid denomitor or invalid input type");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("array index out of bounds");
		}
		catch(NegativeArraySizeException ae1) {
			System.out.println("please be in limits");
		}
		//this generic exception needs to be given to avoid any unanticpated errros and it should be present at the end only 
		//In the above code instead of giving interger value in aray if I give string then ther eis no eceptin that is being handled in the above so it goes to this generic excepiton only
		
     catch(Exception e) {
    	 System.out.println("Generic catch"); 
     }
        System.out.println("connection is closed");

	}

}
