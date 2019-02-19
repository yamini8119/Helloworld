


public class NewInh extends Inheritance{

	public void multiplication(int x, int y) {
		
		int z=x*y;
		
		System.out.println("multiplication of two num is :" +z);
	}
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		
		NewInh Inh = new NewInh();
		
		Inh.Addition(a, b);
		
		Inh.subtraction(a, b);
		
		Inh.multiplication(a, b);
		

		
	}
	}
