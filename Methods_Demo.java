package day6;
class Demo{
//	Instance methods without argument
//	without return type
	 void add(){
		 System.out.println(5+5);
	 }
//	 with return type
	 int sub() {
		return (10-5);
	 }
	 
//	 Static method without argument
//	 without return type
	 static void mul() {
		 System.out.println(10*20);
	 }
//	 with return type
	 static int div() {
		 return(10/2);
	 }
	 
//	Instance method with argument
//	without return type
	 void mod(int a, int b) {
		 System.out.println(a%b);
	 }
//	 with return type
	 double root(int a) {
		 return Math.sqrt(a);
	 }
	 
//	 Static method with argument
//	 without return type
	 static void cube(int a) {
		 System.out.println(Math.pow(a, 3));
	 }
//	 with return type
	 static String name(String n) {
		 return n;
	 }
	  
}


public class Methods_Demo {

	public static void main(String[] args) {
		Demo obj = new Demo();
		
		obj.add();
		System.out.println(obj.sub());
		
		Demo.mul();
		System.out.println(Demo.div());
		
		obj.mod(100, 99);	
		System.out.println(obj.root(32));
		
		Demo.cube(3);
		System.out.println(Demo.name("Aswini"));

	}

}
