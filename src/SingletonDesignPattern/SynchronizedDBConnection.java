package SingletonDesignPattern;

public class SynchronizedDBConnection {

	private static SynchronizedDBConnection conObj;
	
	private SynchronizedDBConnection() {
		
	}
	
	synchronized public static SynchronizedDBConnection getInstance() {
		
		if(conObj == null)
			conObj = new SynchronizedDBConnection();
		return conObj;
	}
}
