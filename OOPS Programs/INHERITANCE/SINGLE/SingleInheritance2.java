class Student {
    String name = "Rohith";

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

class Grades extends Student {
    void showGrades() {
        System.out.println("Grades: A+");
    }
}

public class SingleInheritance2 {
    public static void main(String[] args) {
        Grades g = new Grades();
        g.displayName();
        g.showGrades();
    }
}
