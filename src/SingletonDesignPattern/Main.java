package SingletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		EagerDBConnection dbCon = EagerDBConnection.getInstance();
		LazyDBConnection dbConLazy = LazyDBConnection.getInstance();
		SynchronizedDBConnection dbConSync = SynchronizedDBConnection.getInstance();
		DoubleLockDBConnection dbConLock = DoubleLockDBConnection.getInstance();
	}
}
