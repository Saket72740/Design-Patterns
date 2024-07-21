package AbstractFactoryPattern.VehicleFactories;

import AbstractFactoryPattern.Vehicles.Vehicle;

public interface VehicleFactory {

	public Vehicle getVehicle(String input);
	
}
