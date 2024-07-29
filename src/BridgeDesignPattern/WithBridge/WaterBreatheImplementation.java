package BridgeDesignPattern.WithBridge;

public class WaterBreatheImplementation implements BreatheImplementor {

	@Override
	public void breathe() {
		System.out.println("Breathe through gills\nAbsord O2 from H2O and release CO2");
	}

}
