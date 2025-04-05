interface Employee {
    double getSalary();
    String getRole();
}

class Manager implements Employee {
    public double getSalary() {
        return 75000;
    }

    public String getRole() {
        return "Manager";
    }
}

class Developer implements Employee {
    public double getSalary() {
        return 55000;
    }

    public String getRole() {
        return "Software Developer";
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();

        System.out.println(manager.getRole() + " earns $" + manager.getSalary());
        System.out.println(developer.getRole() + " earns $" + developer.getSalary());
    }
}
