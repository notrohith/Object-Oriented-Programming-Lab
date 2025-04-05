class Student {
    private String studentID;
    private String name;
    private int age;
    private double grade;

    public Student(String studentID, String name, int age, double grade) {
        this.studentID = studentID;
        this.name = name;
        setAge(age);
        setGrade(grade);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be between 5 and 100.");
        }
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100!");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student s = new Student("S101", "Rohith", 18, 92);
        s.displayStudentInfo();
        s.setAge(3);  
        s.setGrade(105);  
	s.setAge(19);
	s.setGrade(99);
        s.displayStudentInfo();
    }
}
