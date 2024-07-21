package AbstractFactoryPattern;

import AbstractFactoryPattern.VehicleFactories.LuxuryFactory;
import AbstractFactoryPattern.VehicleFactories.OrdinaryFactory;
import AbstractFactoryPattern.VehicleFactories.VehicleFactory;
import AbstractFactoryPattern.Vehicles.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		VehicleFactory vehicle1 = new LuxuryFactory();
		VehicleFactory vehicle2 = new OrdinaryFactory();
		Vehicle v;
		String input = "ALTO";
		if(vehicle1.getVehicle(input) == null)
			v = vehicle2.getVehicle(input);
		else
			v = vehicle1.getVehicle(input);
		if(v != null)
			v.drive();
	}
}
