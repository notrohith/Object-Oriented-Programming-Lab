class University {
    void uniName() {
        System.out.println("Amrita Vishwa Vidyapeetham");
    }
}

class Department extends University {
    void deptName() {
        System.out.println("Department: CSE");
    }
}

class Student extends Department {
    void studentName() {
        System.out.println("Student: Rohith");
    }
}

public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.uniName();
        s.deptName();
        s.studentName();
    }
}
