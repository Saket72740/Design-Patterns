package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

	String userName;
	StockObservable observable;
	
	public MobileAlertObserverImpl(String emailId, StockObservable observable) {
		this.observable = observable;
		this.userName = emailId;
	}

	@Override
	public void update() {
		sendMsgOnMobile(userName, "Product is in stock hurry up!");
	}
	
	private void sendMsgOnMobile(String userName, String msg) {
		System.out.println("Msg sent to: " + userName);
	}
	
	
}
