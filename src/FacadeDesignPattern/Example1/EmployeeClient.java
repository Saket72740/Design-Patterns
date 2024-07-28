package FacadeDesignPattern.Example1;

public class EmployeeClient {

	public static void main(String args[]) {
		EmployeeFacade employeeFacade = new EmployeeFacade();
		Employee employeeDetails = employeeFacade.getEmployeeDetails("saket@gmail.com");
		System.out.println(employeeDetails);
	}
}
