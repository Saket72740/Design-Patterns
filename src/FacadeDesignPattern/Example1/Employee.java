package FacadeDesignPattern.Example1;

public class Employee {
	
	String name;
	String emailId;
	String role;
	
	public Employee() {
		this.name = "____";
		this.emailId = "_____";
		this.role = "_____";
	}
	public Employee(String name, String emailId, String role) {
		this.name = name;
		this.emailId = emailId;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emailId=" + emailId + ", role=" + role + "]";
	}
	
	
}
