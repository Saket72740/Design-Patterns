package SingletonDesignPattern;

public class DoubleLockDBConnection {

	private static DoubleLockDBConnection conObj;
//	private static volatile DoubleLockDBConnection conObj;
	int memberVariable;
	
	private DoubleLockDBConnection(int memberVariable) {
		this.memberVariable = memberVariable;
	}
	
	public static DoubleLockDBConnection getInstance() {
		if(conObj == null) {
			synchronized (DoubleLockDBConnection.class) {
				if(conObj == null) {
					conObj = new DoubleLockDBConnection(10);
				}
			}
		}
		return conObj;
	}
	
//	private static DoubleLockDBConnection getInstance() {
//		if(conObj == null) {
//			synchronized (DoubleLockDBConnection.class) {
//				if(conObj == null) {
//					memoryPointer = allocateMemory();
//					memoryPointer.numberVariable = initializeVariable();
//					conObj = memoryPointer;
//				}
//			}
//		}
//		
//		return conObj;
//	}
	
}
