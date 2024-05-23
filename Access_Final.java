package day3;

  class Box{
	
	 Box(int l, int w, int h) {
		 System.out.println("Area of the box: " + area(l, w, h));
	 }
	 final double area(int l, int w, int h) {
	     return l * w * h;
	 }
  }
 
// Try to inherit the Box class 
//class whiteBox extends Box{   //but we can't inherit the final class
//	whiteBox(int l, int w, int h) {
//		super(l, w, h);	
//	}
// Trying to override the final method 
//	double area(int l, int w, int h) {  // but we can't override the final method
//		return l * w * h;
//	}
//}

public class Access_Final {
	public static void main(String[] args) {
		final double PI = 3.14;
		System.out.println("print the final PI value :" + PI);
		
//		try to change the final variable's value
//		PI = 2.4;  --> can't change the final variable value
		
		Box blackBox = new Box(5, 4, 3);
		Box whiteBox = new Box(10, 10, 5);
		
	}
	
}
