
public class TestEncapsulation {
	
	public static void main(String[] args) {
		
	Encapsulation obj = new Encapsulation();
		
	obj.setGeekAge(20);
		
	obj.setGeekName("Greek");
		
	obj.setGeekRoll(04);
		
	System.out.println("geeks name is : " + obj.getGeekName());
	
	System.out.println("geeks age is : " + obj.getGeekAge());
	System.out.println("geeks roll number is : "+ obj.getGeekRoll());
	}
	

}
