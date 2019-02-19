
public class SmallClass extends BigClass{
	
	int num = 20;
	
public void display() {
		
		System.out.println("this display method of subclass");
	}
public void my_Method() {
		
		SmallClass sub = new SmallClass();
		
		sub.display();
		
		super.display();
		
	System.out.println("print variable in sub class " + sub.num);
	
	System.out.println("print varibles in super calss " + super.num);
		
	}
	public static void main(String[] args) {
		
		SmallClass obj = new SmallClass();
		
		obj.my_Method();
		
		
	}
	

}
