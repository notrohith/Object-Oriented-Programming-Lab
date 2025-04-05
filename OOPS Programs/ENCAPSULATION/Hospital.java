class Patient {
    private String patientID;
    private String name;
    private int age;
    private String disease;

    public Patient(String patientID, String name, int age, String disease) {
        this.patientID = patientID;
        this.name = name;
        setAge(age);
        this.disease = disease;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void displayPatientInfo() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
}

public class Hospital{
    public static void main(String[] args) {
        Patient p = new Patient("P123", "Kailash", 18, "Fever");
        p.displayPatientInfo();
        p.setAge(-5);  
        p.setDisease("Flu");
        p.displayPatientInfo();
    }
}
