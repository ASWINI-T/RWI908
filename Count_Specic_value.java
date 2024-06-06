package day13;

public class Count_Specic_value {

	public static void main(String[] args) {
		char[] a= {'a','b','a','d','a','e','a'};
		int count=0;
		char search = 'a';
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]== search) {
				count++;
			}
		}
		System.out.println("\""+search + "\""+ " presents " +count+ " times in this list");

	}

}
