package day8;

// Superclass
class Shape {
	void draw() {
        System.out.println("Drawing a shape");
	}
}

// Subclass 1
class Circle extends Shape {
	@Override	//-->Run time Polymorphism
    void draw() {
		System.out.println("Drawing a circle");
	}
}

// Subclass 2
class Rectangle extends Shape {
	@Override
    void draw() {
		System.out.println("Drawing a rectangle");
	}
}

public class Polymorphism_Demo {
    public static void main(String[] args) {
    	// Creating objects of different subclasses
	    Shape myShape1 = new Circle();
	    Shape myShape2 = new Rectangle();
	        
	    // Calling the overridden methods
	    myShape1.draw(); 
	    myShape2.draw(); 
   }
}
