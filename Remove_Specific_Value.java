package day13;

public class Remove_Specific_Value {

	public static void main(String[] args) {
		int val = 2;
		int[] nums = {1,4,3,2,4,2,};
		int k =0;
		
		 for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }
		 System.out.println("Number of elements after removal: " + k);
		 
		 for(int i = 0; i<k; i++) {
			 System.out.print(nums[i] +" ");
		 }

	}

}
