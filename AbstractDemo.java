package day9;
abstract class member {
    private String name;

    // Constructor
    public member(String name) {
        this.name = name;
    }

    abstract void welcomeMgs();

    public String getName() {
        return name;
    }
}

class Student extends member {
    public Student(String name) {
        super(name); // Call to the superclass constructor
    }

    void welcomeMgs() {
        System.out.println("Hello " + getName());
    }
}

class Teacher extends member {
    public Teacher(String name) {
        super(name); // Call to the superclass constructor
    }

    void welcomeMgs() {
        System.out.println("Hello " + getName());
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Student S1 = new Student("Aswini");
        Teacher T1 = new Teacher("Sri");

        S1.welcomeMgs();
//        System.out.println(S1.getName());

        T1.welcomeMgs();
//        System.out.println(T1.getName());
    }
}

//
//abstract  class member{
//	private String name;
//	abstract void welcomeMgs();  // abstract method -> without body
//	
//	public String getName(){	// Concrete method -> with body
//		return name;
//	}
//	
//	public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Student extends member{		// inherits Student class -> must define all the method which is in the base class
//	void welcomeMgs() {
//		System.out.println("Hello  student");
//		
//	}
//	String name = "Aswini";
//	
//}
//
//class Teacher extends member{
//	void welcomeMgs() {
//		System.out.println("Hello  Teacher");
//		
//	}
//}
//
//public class AbstractDemo {
//	public static void main(String[] args) {
//		Student S1 = new Student();
////		Teacher T1 = new Teacher();
//		
//		 S1.setName("Aswini");
//	     S1.welcomeMgs();
//	     System.out.println(S1.getName());
//	     
//	     member M1 = new Student();
//	     
//	     M1.setName("Jashwanth");
//	        
//	     M1.welcomeMgs();
//	     System.out.println((M1.getName());
//			
//
//	}
//
//}
