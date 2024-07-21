package AbstractFactoryPattern.VehicleFactories;

import AbstractFactoryPattern.Vehicles.LuxuryVehicle1;
import AbstractFactoryPattern.Vehicles.LuxuryVehicle2;
import AbstractFactoryPattern.Vehicles.Vehicle;

public class LuxuryFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String input) {
		switch(input) {
			case "MERCEDIS":
				return new LuxuryVehicle1();
			case "AAUDI":
				return new LuxuryVehicle2();
			default:
				return null;
		}
	}
	
}
