package day3;

//class A{
//	static {
//		System.out.println("A class static");
//	}
//}

public class Static_Demo {
	
	static {
		System.out.println("class static");
	}
	// Static variable
	static int staticVar = 10;

	// Static method
	static void staticMethod() {
		
		System.out.println("Inside staticMethod");
	}
	    
	public static void main(String[] args) {
//		 A a = new A(); 
//	     B b = new B();
		
		// Accessing static variable and method directly from the class
	    System.out.println("Static variable: " + staticVar);
        staticMethod();
	    }
}

//class B{
//	static {
//		System.out.println("B class static");
//	}
//}


