package day15;

public class TryScatchFinallyEX {

	public static void main(String[] args) {
		
		try {
//			int arr[]= new int[5];
			int arr[]=null;
			System.out.println("No Error "+arr[0]);
			System.out.println("this is not reached if err is occured");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception occured");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured");
		}
		catch(Exception e) {
			System.out.println("Common Exception");
		}
		finally {
			int x = 2, y =2;
			int ans = x+y;
			System.out.println(ans + " finaly block");
			System.out.println("finally will execute always");
		}
		
		
		System.out.println("End");
	}

}
