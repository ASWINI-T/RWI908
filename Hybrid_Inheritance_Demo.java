package day7;

// Hybrid Inheritance

interface Car {
    void carName();
}

interface Bike {
    void bikeName();
}

class Cycle {
    void color() {
        System.out.println("red with black");
    }
}

class Vehicle extends Cycle implements Car, Bike {
    // Implementing methods from interfaces
    public void carName() {
        System.out.println("Car Name: Toyota");
    }

    public void bikeName() {
        System.out.println("Bike Name: TVS Ntorq");
    }

}

public class Hybrid_Inheritance_Demo {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle();

        newVehicle.carName(); // Calling method from Car interface
        newVehicle.bikeName(); // Calling method from Bike interface
        newVehicle.color();   // Calling method from Cycle class
    }
}
