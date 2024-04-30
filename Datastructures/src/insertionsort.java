
public class insertionsort {

	public static void main(String[] args) {
		int nums[]= {6,5,2,8,9,4};
		
		System.out.println("Before Sorting");
		for(int n:nums) {
			
			System.out.print(n+" ");
		} 
		System.out.println();
       
		for(int i=1;i<nums.length;i++) {
			int key=nums[i];
			
			int j=i-1;
			//Here if I give the condition nums[j]>key and j>=0 then it giving index array out of bounds exception because first it tries to check the condition and it has no
			//element in that place for the last condition so its giving that error. Never observed that this will cause the issue.
			//n your specific case, the condition nums[j] > key && j >= 0 is evaluated from left to right. If j is less than 0, the array index nums[j] is out of bounds, causing an ArrayIndexOutOfBoundsException. By switching the order to j >= 0 && nums[j] > key, you ensure that j >= 0 is checked first, preventing the array index from going out of bounds.
			while(j>=0 && nums[j]>key) {
				nums[j+1]=nums[j];
				//System.out.println("nums[j+1] : "+nums[j+1]);
				j--;
			}
			nums[j+1]=key;
			//System.out.println("nms[j+1] :"+nums[j+1]);
		}
		
		
		
		
		
		
		System.out.println();
		System.out.println("After Sorting");
		for (int n:nums) {
			System.out.print(n+" ");
		}

	}

}
