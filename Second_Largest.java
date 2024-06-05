package day12;

public class Second_Largest {
	public static void main(String[] args) {
		int a[]= {2,4,3,5,4,5,1,23,4,78,78,6499};
		int max1,max2;
		
		max1=max2=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i] != max1){
				max2=a[i];
			}
		}
      System.out.print("Second largest element is :" + max2);
	}
}

		