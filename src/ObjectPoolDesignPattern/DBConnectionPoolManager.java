package ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {

	List<DBConnection> freeConnectionsInPool = new ArrayList<>();
	List<DBConnection> connectionsCurrentlyInUse = new ArrayList<>();
	
	//take care to add private static and make dbConnectionPoolManager singleton
	private static int INITIAL_POOL_SIZE = 3;
	private static int MAX_POOL_SIZE = 6;
	private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;
	
	
	public DBConnectionPoolManager() {
		for(int i=0; i<INITIAL_POOL_SIZE; i++) {
			freeConnectionsInPool.add(new DBConnection());
		}
	}
	
	public static DBConnectionPoolManager getInstance() {
		if(dbConnectionPoolManagerInstance == null) {
			synchronized (DBConnectionPoolManager.class) {
				if(dbConnectionPoolManagerInstance == null) {
					dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
				}
			}
		}
		return dbConnectionPoolManagerInstance;
	}
	
	// take care to add synchronised
	public synchronized DBConnection getDBConnection() {
		if(freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE) {
			freeConnectionsInPool.add(new DBConnection());
			System.out.println("Creating new connection and putting into the pool, free pool size: " + freeConnectionsInPool.size());
		}
		else if(freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE) {
			System.out.println("Cannot create new DBConnection, as max limit reached");
			return null;
		}
		DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size()-1);
		connectionsCurrentlyInUse.add(dbConnection);
		return dbConnection;
	}
	
	// take care to add synchronised
	public synchronized void releaseDBConnection(DBConnection dbConnection) {
		if(dbConnection != null) {
			connectionsCurrentlyInUse.remove(dbConnection);
			freeConnectionsInPool.add(dbConnection);
			System.out.println("Releasing DBConnection");
		}
	}
	
}
