
public class Mergesort {
	

	public static void main(String[] args) {
		 int nums[]= {1,5,2,8,9,4};
		    
			System.out.println("Before Sorting");
			for(int n:nums) {
				
				System.out.print(n+" ");
			} 
			System.out.println();
			// Mergesort performs recursion
			mergesort(nums,0,nums.length-1);
			System.out.println("After Sorting");
			for(int n:nums) {
				
				System.out.print(n+" ");
			} 
			System.out.println();


	}

	public static void mergesort(int[] nums, int low, int high) {
		if(low<high) {
			int mid=low+high/2;
			mergesort(nums,low,mid);
			System.out.println(low);
			System.out.println(mid);
			mergesort(nums,mid+1,high);
			System.out.println(mid);
			System.out.println(high);
			merge(nums,low,mid,high);
			
		}
		
		
	}

	private static void merge(int[] nums, int low, int mid, int high) {
		int n1=mid-low+1;
		System.out.println("n1 :"+n1);
	
		int n2=high-mid;
		System.out.println("n2 :"+n2);
		int larr[]=new int[n1];
		int riarr[]=new int[n2];
		for(int x=0;x<n1;x++) {
			
		}
		
	}

}
