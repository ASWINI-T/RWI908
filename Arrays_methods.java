package day13;

import java.util.Arrays;

public class Arrays_methods {
	public static void main(String[] args) {
		int arr[]= {20,50,80,10,90,40};
		
		Arrays.sort(arr);
		System.out.print("\nAscending order: " );
		
		for(int i : arr) {
			System.out.print(i +" ");
		}
		
		int index = Arrays.binarySearch(arr, 30);
		
		System.out.print("\nBinary search " + index );
		
		
		int search= Arrays.binarySearch(arr, 0, 3, 40);
		System.out.print("\nsearch in range of index " + search );
		
		
		int arr1[]= {10,20,40,50,80,90};
		
		int compare = Arrays.compare(arr, arr1);
		System.out.println("\ncomapre 2 arrays " +compare);
		
//		int newLength = 10;
		int[] newArray = Arrays.copyOf(arr, 10);
		System.out.print("New Array elements: ");
		for(int i : newArray) {
			System.out.print(i +" ");
		}
		
		for(int i = newArray.length-1; i>0;i--)
			if(newArray[i]==0) {
				newArray[i]= 30;
			}
		
		for(int i : newArray) {
			System.out.print(i +" ");
		}
	}

}
