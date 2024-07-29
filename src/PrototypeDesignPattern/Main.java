package PrototypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		Student obj = new Student(20, 76, "Saket Kumar");
		
		Student cloneObj = new Student();
		cloneObj.age = obj.age;
		cloneObj.name = obj.name;
		cloneObj.setRollNumber(obj.getRollNumber());
		
		System.out.println(cloneObj);
	}
}
