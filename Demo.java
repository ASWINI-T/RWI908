package inheritance_Ex;

	interface Shape {
	   double getArea();
	   double getPerimeter();
	}
	
 	class Rectangle implements Shape {
     double length;
     double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Demo {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

	}

}
