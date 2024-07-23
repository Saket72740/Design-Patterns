package ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{

	EmployeeDao employeeDao;
	
	EmployeeDaoProxy(){
		employeeDao = new EmployeeDaoImpl();
	}
	
	public void create(String client, EmployeeDo obj) throws Exception{
		if(client.equals("ADMIN")) {
			employeeDao.create(client, obj);
			return ;
		}
		throw new Exception("Access Denied");
	}
	
	public void delete(String client, int employeeId) throws Exception{
		if(client.equals("ADMIN")) {
			employeeDao.delete(client, employeeId);
			return ;
		}
		throw new Exception("Access Denied");
	}
	
	public EmployeeDo get(String client, int employeeId) throws Exception{
		if(client.equals("ADMIN")) {
			return employeeDao.get(client, employeeId);
		}
		throw new Exception("Access Denied");
	}
	
}
