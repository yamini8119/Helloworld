
public class MyExample {
	
	int age;
	
	String name;
	
	String designation;
	
	public  MyExample(int age1) {
		
			this.age = age1;
			
		}
	public void myName(String myName) {
		
		name = myName;
	}
		
	public void myDes(String myDes) {
		
		designation=myDes;
		
	}
	public void diplayOutput() {
		
		System.out.println("print name :" + name);
		System.out.println("print age :" + age);
		System.out.println("print designation :"+designation);
		
	}
	
	
		
	}


