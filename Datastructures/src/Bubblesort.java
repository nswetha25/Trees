
public class Bubblesort {

	public static void main(String[] args) {
		int nums[]= {6,5,2,8,9,4};
		int temp=0;
		System.out.println("Before Sorting");
		for(int n:nums) {
			
			System.out.print(n+" ");
		}
		//Two loops - Outer loops responsible for number of iterations and inner loop for swapping
		//In this below program if I use j<nums.lenght-1 it gives the output correctly but from the diagram we understood that once it completes the loop the last element
		//is sorted anyway so we dont want to go again.
		for(int i=0;i<nums.length;i++) {
			//System.out.println("for i :"+i+" "+nums[i]);
			for(int j=0 ;j<nums.length-1;j++) {
			//System.out.println("for j :"+j+" "+nums[j]);
			if (nums[j]>nums[j+1] ){
				temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
			}
			}
			System.out.println();
			for (int n:nums) {
				System.out.print(n+" ");
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int n:nums) {
			System.out.print(n+" ");
		}
		
		System.out.println("------------------------");
		//If I dont want to go again to the last element even for checking as it is already sorted we can slightly modify the above condiiont j<nums.length-1 to j<nums.lenght-i-1
		//if I run both the above and below for loop it does not change the output but it will affect the speed beacuae the number of steps taken will be less
		for(int i=0;i<nums.length;i++) {
			//System.out.println("for i :"+i+" "+nums[i]);
			for(int j=0 ;j<(nums.length)-i-1;j++) {
				//System.out.println("for j :"+j+" "+nums[j]);
				if (nums[j]>nums[j+1] ){
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			}
			System.out.println();
			for (int n:nums) {
				System.out.print(n+" ");
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int n:nums) {
			System.out.print(n+" ");
		}
		

	}

}
}
