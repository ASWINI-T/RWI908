package day7;

class Animal {  // Super Class or Parent class
    void eat() {
        System.out.println("Eating...");
    }
}

//Single Inheritance --> A class inherits from one superclass
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Multilevel inheritance --> A class inherits from a superclass, and another class inherits from that subclass
class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

//Hierarchical inheritance --> Multiple classes inherit from a single superclass.
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}


public class Inheritance_Demo {

	public static void main(String[] args) {
		Animal newAni = new Animal();
		Dog newDog = new  Dog();
		BabyDog newBD = new BabyDog();
		Cat newCat = new Cat();
		
		
		System.out.println("call using Superclass(Animal) class reference");
		newAni.eat();	// using super class object reference	
		
		System.out.println("method call using Dog class reference");
		newDog.eat();   // call super class method
		newDog.bark();  // call Dog class method using Dog class object reference
		
		System.out.println("method call using BabyDog class reference");
		newBD.eat();	// call super class method
		newBD.bark();   // call dog class method
		newBD.weep();	// call BabyDog class method
		
		System.out.println("method call using Cat class reference");
		newCat.eat();	// call super class method
		newCat.meow();	// call cat class method
		
	}

}
