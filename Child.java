package day3;

class Parent {
 protected int variable;

 protected void method() {
     System.out.println("Protected method in Parent class");
 }
}

public class Child extends Parent {
 public static void main(String[] args) {
     Child child = new Child();
     child.variable = 10; 
     System.out.println("Protected field value: " + child.variable);

     child.method(); 
 }
}
