
public class Parent {
	
	private String name;
	
	private String type;

	public Parent(String name) {
		this.name = name;
		System.out.println("Inside Parent Constructor :" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
