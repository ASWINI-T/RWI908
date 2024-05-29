package day7;

interface classA {
    void name();
}

interface classB {
    void role();
}

class Employee implements classA, classB {
    public void name() {
        System.out.println("Aswini");
    }

    public void role() {
        System.out.println("Software developer");
    }
}


public class Multiple_Inheritance_Demo {
	public static void main(String[] args) {
		classA a = new Employee();
		classB b = new Employee();
		a.name();
		b.role();	
	}
}


