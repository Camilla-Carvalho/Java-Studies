package entities;

public class Student extends Person{
	private String name;
	private String ra;
	
	
	
	public Student() {
		
	}
	
	public Student(String name, String ra) {
		super();
		this.name = name;
		this.ra = ra;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRa() {
		return ra;
	}


	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public Student(String ra) {
		super();
		this.ra = ra;
	}

	
}
