package day13;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		int num1[]= {1,3};
		int num2[] = {2};
		
		int num3[]= new int[num1.length +num2.length];
		
		for(int i = 0 ; i<num1.length;i++) {
			num3[i] = num1[i];
		}
		int n=0;
		for(int i = num1.length ; i<num3.length;i++) {
			num3[i] = num2[n];
			n++;
		}
		Arrays.sort(num3);
		System.out.print("Merged Array ");
		for(int i : num3)
			System.out.print(i + " ");
		
		 double median;
	        if (num3.length % 2 == 0) {
	            median = (num3[num3.length / 2 - 1] + num3[num3.length / 2]) / 2.0;
	        } else {
	            median = num3[num3.length / 2];
	        }
	        
	        System.out.print("\nMedian of the array: " + median);
		}

}
