package FacadeDesignPattern.Example1;

public class EmployeeFacade {

	EmployeeDAO employeeDAO;
	
	public EmployeeFacade() {
		employeeDAO = new EmployeeDAO();
	}
	
	public void insert() {
		employeeDAO.insert();
	}
	
	public Employee getEmployeeDetails(String emailId) {
		return employeeDAO.getEmployeeDetails("saket@gmail.com");
	}
}
