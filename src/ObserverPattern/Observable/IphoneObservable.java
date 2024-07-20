package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservable implements StockObservable{
	
	public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
	public int stockCount = 0;
	
	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}
	
	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
	}
	
	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver obs: observerList) {
			obs.update();
		}
	}
	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0) {
			notifySubscribers();
		}
		
		stockCount += newStockAdded;
	}
	
	@Override
	public int getStockCount() {
		return stockCount;
	}
	
	

}
