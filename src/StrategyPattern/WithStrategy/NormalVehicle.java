package StrategyPattern.WithStrategy;

public class NormalVehicle extends Vehicle {

	public NormalVehicle() {
		super(new NormalDriveStrategy());
	}
}
