class Student{
	String name;
	int rollNo;
	int age;
	Student(String studentName){
		name = studentName;
		System.out.println("Student Name: " + name);
	}

	Student(String studentName, int studentRollNo){
		name = studentName;
		rollNo = studentRollNo;
		System.out.println("Student Name: "+name+", Student rollNo: "+rollNo);
	}

	Student(String studentName, int studentRollNo, int studentAge){
		name = studentName;
		rollNo=studentRollNo;
		age=studentAge;
		System.out.println("Student Name: "+name+", Student rollNo: "+rollNo+", Student age: "+age);
	}
	public static void main(String[] args){
		Student s1 = new Student("Preetham");
		Student s2 = new Student("Raghav",155);
		Student s3 = new Student("Srini",146, 18);
	}
}
