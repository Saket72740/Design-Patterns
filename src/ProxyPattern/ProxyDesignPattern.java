package ProxyPattern;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		try {
			EmployeeDao emptableObj = new EmployeeDaoProxy();
			emptableObj.create("ADMIN", new EmployeeDo());
			System.out.println("Operation Successful");
			System.out.println("\n2nd operation starts \n");
			emptableObj.create("USER", new EmployeeDo());
			System.out.println("Operation Successful");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
