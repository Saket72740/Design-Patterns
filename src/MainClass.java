import StrategyPattern.WithStrategy.DriveStrategy;
import StrategyPattern.WithStrategy.NormalVehicle;
import StrategyPattern.WithStrategy.Vehicle;
import StrategyPattern.WithStrategy.SportsVehicle;

public class MainClass {
	
	public static void main(String[] args) {
		Vehicle vehicle = new NormalVehicle();
		vehicle.drive();
	}
	
}
