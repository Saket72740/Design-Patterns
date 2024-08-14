package MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
	
	List<ConfigurationMemento> history = new ArrayList<>();
	
	public void addMemento(ConfigurationMemento memento) {
		history.add(memento);
	}
	
	public ConfigurationMemento undo() {
		if(!history.isEmpty()) {
			int lasMementoIndex = history.size() - 1;
			ConfigurationMemento lastMemento = history.get(lasMementoIndex);
			history.remove(lasMementoIndex);
			return lastMemento;
		}
		return null;
	}

}
