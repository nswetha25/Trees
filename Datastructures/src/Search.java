//we work on linear and binary search here. If I talk about linear search the array need not to be sorted for sure as we will check all the elements one by one. But for binary 
//search the elements need to be sorted.
//I also addes steps variable to see how many steps it is taking but if u observe id id not count durijg comparisions because I only want to see how many the loop has run 
//whether it is all over the arry or how many elements it has seen .

//Everytime if we double the values binary search takes only on extra step than before. Thats why binary search is O(log n) whereas linear search is O(n)
public class Search {

	public static void main(String[] args) {
		  //int nums[]= {2,5,8,11,45,56,78,54};
		int nums[]=new int[4000];
		  int target=78;
		  int result=linearsearch(nums,target);
		  //Linear search
		  if(result!=-1) {
		 System.out.println("Element found at index :"+result);
		  }else {
			  System.out.println("Element is not present");
		  }
		  
		  int result1=binarysearch(nums,target);
		  //Binary search
		  if(result1!=-1) {
		 System.out.println("Element found at index through binary search:"+result1);
		  }else {
			  System.out.println("Element is not present");
		  } 

	}
	
//having static here to deal with out using objects
	
	public static int linearsearch(int[] nums, int target) {
		int steps=0;
		for(int i=0;i<nums.length;i++) {
			steps++;
			if(nums[i]==target) {
				System.out.println("steps in linear search :"+steps);
				return i;
			}
			
		}
		System.out.println("steps in linear search :"+steps);
	
		return -1;
		

	}
//Binary search implementation
	public static int binarysearch(int[] nums, int target) {
		int left=0;
		int right =nums.length-1;
		int steps=0;
		
		while (left<=right){
			steps++;
			int mid=(left+right)/2;
			if (nums[mid]<target) {
				
				left=mid+1;
			}
			else if(nums[mid]>target) {
				right=mid-1;
				
			}
			else if (nums[mid]==target){
				System.out.println("steps in binary  search :"+steps);
				
				return mid;
			}
			
			
		}
		System.out.println("steps in binary search :"+steps);
		return -1;
		
			
	
		
	}
}
