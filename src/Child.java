public class Child extends Parent{

	public Child(String parentName) {
		super(parentName);
	}

	public static void main(String[] args) {
		
		Child c = new Child("Raghu");
		String name = c.getName();
		System.out.println("Parent Name="+name);
	}
	
	
}