//Here in this binary search I am using recursion concept. Not much difference between the recursive and iterative approach
public class binarysearch {

	public static void main(String[] args) {
		int nums[]= {10,20,30,40,50,60,70};
		  int target=70;
		  int result1=binarysearch(nums,target,0,nums.length-1);
		  //Binary search
		  if(result1!=-1) {
		 System.out.println("Element found at index through binary search:"+result1);
		  }else {
			  System.out.println("Element is not present");
		  } 

	}
	
	public static int binarysearch(int[] nums,int target,int left,int right) {
		int steps=0;
		if(left<=right) { 
			steps++;
		int mid=(left+right)/2;
		//System.out.println("mid :"+mid);
		if(target==nums[mid]) {
			return mid;
			
		}
		else if(nums[mid]>target){
			
			binarysearch(nums,target,0,mid-1);
			System.out.println("right :"+right);
		}
		else {
			binarysearch(nums,target,mid+1,nums.length-1);
			System.out.println("left :"+left);
			
		}
		}  
		System.out.println(steps);
	
	return -1;
}
//	public static int binarysearch(int[] nums, int target) {
//		int left=0;
//		int right =nums.length-1;
//		int steps=0;
//		
//		while (left<=right){
//			steps++;
//			int mid=(left+right)/2;
//			if (nums[mid]<target) {
//				
//				left=mid+1;
//			}
//			else if(nums[mid]>target) {
//				right=mid-1;
//				
//			}
//			else if (nums[mid]==target){
//				System.out.println("steps in binary  search :"+steps);
//				
//				return mid;
//			}
//			
//			
//		}
//		System.out.println("steps in binary search :"+steps);
//		return -1;
//
//	}

}
