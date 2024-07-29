package PrototypeDesignPattern;

public class Student {

	int age;
	private int rollNumber;
	String name;
	
	public Student() {
		
	}
	
	public Student(int age, int rollNumber, String name) {
		this.age = age;
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
}
