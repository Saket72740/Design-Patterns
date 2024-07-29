package SingletonDesignPattern;

public class EagerDBConnection {

	private static EagerDBConnection conObject = new EagerDBConnection();
	
	private EagerDBConnection() {
		
	}
	
	public static EagerDBConnection getInstance() {
		return conObject;
	}
	
}
