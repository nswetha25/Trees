//Here we can select max value or min value. Like lets consider min value then we place it iin the first position but if I consider max value I will place it in last position
public class Selectionsort {

	public static void main(String[] args) {
		int nums[]= {6,5,2,8,9,4};
		int temp=0;
		int minindex;
		System.out.println("Before Sorting");
		for(int n:nums) {
			
			System.out.print(n+" ");
		} 
		System.out.println();
		//Selection sort
		
		for(int i=0;i<nums.length-1;i++) {
			minindex=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minindex]>nums[j]) {
					minindex=j;
				}
			}
			temp=nums[minindex];
			nums[minindex]=nums[i];
			nums[i]=temp;
			
			for(int n:nums) {
				
				System.out.print(n+" ");
			} 
			System.out.println();
			
		}
			System.out.println();
			System.out.println("After Sorting");
			for (int n:nums) {
				System.out.print(n+" ");
			}
			

	}

}
