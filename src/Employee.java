
//The Employee class has four instance variables - 
//name, age, designation and salary. 
//The class has one explicitly defined constructor,
//which takes a parameter.

public class Employee {
	int age;
	String name;
	double salary;
	String designation;
	public Employee (String name) {
		this.name=name;
	}
	public  void empDes(String empDes) {
		designation=empDes;
	}
	public void empAge(int empAge) {
		age=empAge;
	}
	public void empSal(double empSal) {
		salary=empSal;
	}
	public void printEmployee() {
		System.out.println("Employee name is " + name);
		System.out.println("Empolyee age is " + age);
		System.out.println("Empolyee salary is " + salary);
		System.out.println( "Employee designation is " + designation);
	}
	}
	
