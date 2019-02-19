
public class NewEmployeeTest {
	
	public static void main(String[] args) {
		
	int i = 1; //declaring variable i as integer and assigning value to it	
	// It creates object by passing 2 parameters for name, designation 
	NewEmployee emp1 = new  NewEmployee("yamini","software devloper");
	 
	emp1.setAge(27); // it sets employee age
	
	emp1.setSal(1000); // it sets salary
	
	emp1.printemployee();	// it prints New employee properties
	}
	
}


//1. i have to write a class
//2. I have to create an object
//3. declare properties
//4. Assign values
//5. print