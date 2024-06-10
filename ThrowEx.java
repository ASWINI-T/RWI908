package day15;

public class ThrowEx {
	public static void main(String[] args) {
		int age = 23;
		if (age < 18) {
		    throw new ArithmeticException("Access denied");
		} else {
		    System.out.println("Allowed");
		}

	}

}
