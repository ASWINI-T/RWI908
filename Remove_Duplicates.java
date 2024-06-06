package day13;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int[] arr = { 1,1,2,3,4,4,5};
		
        int k = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
            	arr[k] = arr[i];
                k++;
            }
        }       
        System.out.println("Number of unique elements: " + k);
        
        System.out.print("Unique elements: ");
        for (int i = 0; i<k; i++) {
            System.out.print(arr[i] + " ");
        }		
	         
	}

}
