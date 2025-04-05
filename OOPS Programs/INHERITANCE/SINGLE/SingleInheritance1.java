class Employee {
    String name = "Rohith";
    int id = 101;

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Manager extends Employee {
    void department() {
        System.out.println("Department: HR");
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showDetails();
        m.department();
    }
}
