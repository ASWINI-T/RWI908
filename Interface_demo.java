package day9;

interface Ridable{	//Super class
	int Max_Speed =90; 	//  final, static, and public by default. interface doesn't allow us to define instance variables
	 void ride();	// abstract method 	
	 
	/* from java 1.8 version 
	 we can also define method in interface using default keyword  
	 and also override that methods
	 */
	 
	 default void display() {	
		 System.out.println("hello from Ridable Interface");
	 }
	 
}
class car implements Ridable{
	public void ride() {
		System.out.println("u r ridding a car");
	 }
	
	public void display() {		// we can override the default methods
		System.out.println("Hello from car class");
	}
}

class bike implements Ridable{
	public void ride() {
		System.out.println("u r ridding a bike");
	 }
}

class mechanic{
	public void check(Ridable r) {
		System.out.println("Checking");
		r.ride();
	}
}
public class Interface_demo {
	public static void main(String[] args) {
//		Ridable r = new car();
		mechanic m = new mechanic();
		car c = new car();
		bike b = new bike();
		c.display();
		m.check(c);
		m.check(b);	

	}

}
