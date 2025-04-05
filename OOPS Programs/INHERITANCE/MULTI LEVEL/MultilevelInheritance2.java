class Person {
    public Person() {
        System.out.println("Class Person");
    }
    public void showDetails() {
        System.out.println("Name: Rohith S");
    }
}

class Employee extends Person {
    public Employee() {
        System.out.println("Class Employee");
    }
    public void showSalary() {
        System.out.println("Salary: $60,000");
    }
}

class Manager extends Employee {
    public Manager() {
        System.out.println("Class Manager");
    }
    public void showDepartment() {
        System.out.println("Department: Operations");
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showDetails();
        m.showSalary();
        m.showDepartment();
    }
}
