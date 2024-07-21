package AbstractFactoryPattern.VehicleFactories;

import AbstractFactoryPattern.Vehicles.OrdinaryVehicle1;
import AbstractFactoryPattern.Vehicles.OrdinaryVehicle2;
import AbstractFactoryPattern.Vehicles.Vehicle;

public class OrdinaryFactory implements VehicleFactory{
	
	@Override
	public Vehicle getVehicle(String input) {
		
		switch (input) {
			case "ALTO":
				return new OrdinaryVehicle1();
			case "WAGONR":
				return new OrdinaryVehicle2();
			default:
				return null;
		}
	}

} 
