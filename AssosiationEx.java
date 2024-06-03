package day10;

import java.util.ArrayList;
import java.util.List;

public class AssosiationEx {

    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");

        // Creating instances of the nested Employee class
        Bank.Employee e = bank.new Employee("Ashwini");
        Bank.Employee e1 = bank.new Employee("Jashwanth");

        // Output their names
        System.out.println("Employee 1 " + e.getName());
        System.out.println("Employee 2 " + e1.getName());
        
        
//    }
//}
	
//	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        emp.setName("Rubavathi");

	        Mobile nu = new Mobile();
	        nu.setMobileno(1234567890);
	        Mobile nu1 = new Mobile();
	        nu1.setMobileno(1234598760);

	        List<Mobile> numlist = new ArrayList<>();
	        numlist.add(nu);
	        numlist.add(nu1);

	        emp.setMobile(numlist);

	        System.out.println(emp.getName() + " " + emp.getMobile());
	    }
	}

