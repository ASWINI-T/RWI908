package day12;

public class Average_of_Array_Element {
	public static void main(String[] args) {
		int[] Array = {21,12,23,24,7,11};
		int tot_Element = Array.length;
		int sum = 0;
		
		for(int i = 0; i<tot_Element; i++) {
			sum+=Array[i];
		}
		System.out.println("Average of array element " +sum/tot_Element);
	}
}
