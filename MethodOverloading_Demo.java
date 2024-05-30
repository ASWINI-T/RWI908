package day8;

class calculator{
	int add(int a , int b) {
		return a+b;
	
	}
	//	method overloading --> Compile-time Polymorphism
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class MethodOverloading_Demo {
	public static void main(String[] args) {
		calculator inp = new calculator();
		System.out.println(inp.add(20, 130));
		System.out.println(inp.add(24, 533, 3));
	}

}
