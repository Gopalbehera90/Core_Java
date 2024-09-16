package oops;

public class Employee {

	public String Name;
	public int EmpId;
	private int Salary;
	public void Display() {
		
		System.out.println("Name of the employee is " + Name);
		System.out.println("Id of the employee is " + EmpId);
		System.out.println("Salary of the employer is " + Salary);
	}
	
	public void SetSalary(int sal) {
		
		this.Salary = sal;
	}
	
	
}
