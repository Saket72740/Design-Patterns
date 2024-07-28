package FacadeDesignPattern.Example1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	List<Employee> empList = new ArrayList<>();
	
	public EmployeeDAO() {
		empList.add(new Employee("Saket", "saket@gmail.com", "SDE"));
		empList.add(new Employee("Saket Kumar", "saket@yahoo.com", "SDE-2"));
		empList.add(new Employee("Saket Srivastav", "saket@outlook.com", "SDE-3"));
	}
	public void insert() {
		// logic for insert in Employee Table
	}
	
	public void updateEmployeeName() {
		// logic for updating employee Table
	}
	
	public Employee getEmployeeDetails(String emailID) {
		for(Employee emp: empList) {
			if(emp.emailId.equals(emailID))
				return emp;
		}
		return new Employee();
	}
}
