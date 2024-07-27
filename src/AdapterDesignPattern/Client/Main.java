package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

	public static void main(String[] args) {
		WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		System.out.println(adapter.getWeightInKg());
	}
}
