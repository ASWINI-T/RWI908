package day15;

public class Exception_Handling {
	public static void main(String[] args) {
		int a= 10, b= 0, c= 0;
		
		try {
			c= a/b;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error Occured");
			
		}
//		catch(ArithmeticException e) {
//			System.out.println("Error occured");
//		}
		
		System.out.println(c);
		System.out.println("End of the program");
	}
}
