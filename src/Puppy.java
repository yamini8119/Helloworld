
//This example explains how to access instance variables 
//and methods of a class.
public class Puppy {

	int PuppyAge;
	
	public Puppy (String name) {
		
		System.out.println("my puppy name is " +name);
		
	}
	public void setAge(int age) {
		
		PuppyAge=age;
	}
	public int getAge() {
		
		return PuppyAge;
	}
	
	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy("tommy");
		
		myPuppy.setAge(2);
		
		myPuppy.getAge();
		
		System.out.println( "my Puppy Aage is:" + myPuppy.PuppyAge);
		
	}
}
