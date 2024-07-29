package SingletonDesignPattern;

public class LazyDBConnection {
	
	private static LazyDBConnection conObj;
	
	private LazyDBConnection() {
		
	}
	
	public static LazyDBConnection getInstance() {
		if(conObj == null)
			conObj = new LazyDBConnection();
		return conObj;
	}

}
