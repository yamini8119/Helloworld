
public class Dog {
	
	int age;
	
	String dogname;
	
	public Dog(int age) {
		
		this.age = age;
		
	}
	
	public void name(String name) {
		
		dogname = name;
	}
	
	public void display() {
		
	System.out.println("print dogname : " + dogname);
	
	System.out.println("print age : " + age);
	}
	
	

}
