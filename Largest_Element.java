package day12;

public class Largest_Element {
	
	public static void main(String[] args) {
		int[] a = {42, 45,23,94,33,76};
		
		System.out.println("Largest element in a list: " +Largest_Element.largest_element(a));		

	}
	public static int largest_element(int[] a) {
		int largest = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		return largest;
		
	}

}
