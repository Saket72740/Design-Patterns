package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		System.out.println("Created new row in the employee table");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		System.out.println("deleted row with employeeId: " + employeeId);
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Fetching data from the DB");
		return new EmployeeDo();
	}
	

}
