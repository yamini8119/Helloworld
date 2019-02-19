
public class NewEmployee {
	
	String name;
	
	int age;
	
	double salary;
	
	String designation;
	
	public NewEmployee(String name, String desgnation) {
		
		this.name = name;
		
		this.designation = desgnation;
	}
	public NewEmployee(int age) {
		
		this.age = age;
	}
	public void newemployee(double salary) {
		
		this.salary = salary;

		
	}
	public void setAge(int fromage) {
		this.age = fromage;	
	}
	public void setSal(double sal) {
		this.salary = sal;
	}
	public void printemployee(){
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("salary=" + salary);
		System.out.println("designation=" + designation);
	}
 {
		
		
	}
}
