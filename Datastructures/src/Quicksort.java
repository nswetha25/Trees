
public class Quicksort {

	

    public static void quicksort(int arr[],int low,int high) {
    	if(low<high) {
    		int pi=partition(arr,low,high);
    		System.out.println("pi :"+pi);
    		//Here pi will be in correct place and we dont touch it
    		quicksort(arr,low,pi-1);
    		quicksort(arr,pi+1,high);
    	}
	
}
    //Here it can be private method because we are not going to use partition anywhere apart from this quicksort method
    private static int partition(int[] arr,int low,int high) {
    	int pivot=arr[high]; // here we can select any element as pivot
    	System.out.println("pivot element: "+pivot);
    	int i=low-1;
    	
    	for(int j=low;j<high;j++) {
    		if(arr[j]<pivot) {
    			i++;
    			int temp=arr[i];
    			System.out.println("temp :"+temp);
    			arr[i]=arr[j];
    			System.out.println("arr[i] :"+arr[i]);
    			arr[j]=temp;
    			System.out.println("arr[j] :"+arr[j]);
    		}
    	}
    	int temp=arr[i+1];
    	System.out.println("temp :"+temp);
    	arr[i+1]=arr[high];
    	System.out.println("arr[i+1] :"+arr[i+1]);
    	arr[high]=temp;
    	System.out.println("arr[high] :"+arr[high]);
    	return i+1;
    }
    public static void main(String[] args) {
    	
    	 int nums[]= {1,5,2,8,9,4};
    
		System.out.println("Before Sorting");
		for(int n:nums) {
			
			System.out.print(n+" ");
		} 
		System.out.println();
		// Quicksort performs recursion
		quicksort(nums,0,nums.length-1);
		System.out.println("After Sorting");
		for(int n:nums) {
			
			System.out.print(n+" ");
		} 
		System.out.println();

	}
}


