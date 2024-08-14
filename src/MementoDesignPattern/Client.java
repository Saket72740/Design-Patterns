package MementoDesignPattern;

public class Client {
	
	public static void main(String[] args) {
	
		ConfigurationOriginator originatorObject = new ConfigurationOriginator(5, 10);
		// initiate State of the originator
		ConfigurationMemento snapShot1 = originatorObject.createMemento();
		
		// save it
		ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
		
		// add it to history
		careTakerObject.addMemento(snapShot1);
		
		// originator changing to new state
		originatorObject.setHeight(7);
		originatorObject.setWidth(12);
		
		// save it
		ConfigurationMemento snapShot2 = originatorObject.createMemento();
		
		// add it to history
		careTakerObject.addMemento(snapShot2);
		
		// originator changing to new state
		originatorObject.setHeight(9);
		originatorObject.setWidth(14);
		
		ConfigurationMemento restoredStateMementoObj = careTakerObject.undo();
		originatorObject.restoreMemento(restoredStateMementoObj);
		
		System.out.println("Height: " + originatorObject.height + " Width: " + originatorObject.width);
	}
	
}
