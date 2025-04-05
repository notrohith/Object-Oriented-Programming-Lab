class Employee{
	void getSalary(){
		System.out.println("Employee Salary");
	}
}
class Manager extends Employee{
	@Override
	void getSalary(){
		System.out.println("Manager Salary: $80,000 per year");
	}
}
class Developer extends Employee{
	@Override
	void getSalary(){
		System.out.println("Developer Salary: $60,000 per year");
	}
}
class Intern extends Employee{
	@Override
	void getSalary(){
		System.out.println("Intern Salary: $15,000 per year");
	}
}

public class EmployeeTest{
	public static void main(String args[]){
		Employee emp;
		emp = new Manager();
		emp.getSalary();

		emp = new Developer();
		emp.getSalary();
		
		emp = new Intern();
		emp.getSalary();
		}
}

