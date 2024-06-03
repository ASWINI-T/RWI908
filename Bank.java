package day10;

import java.util.List;

class Bank {
    private String bname;
    private List<Employee> employees;

    Bank(String bname) {
        this.bname = bname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	// Employee class as a nested class
    class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    


}
