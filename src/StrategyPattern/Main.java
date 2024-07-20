package StrategyPattern;

import StrategyPattern.WithStrategy.NormalVehicle;
import StrategyPattern.WithStrategy.Vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new NormalVehicle();
		vehicle.drive();
	}
	
}
