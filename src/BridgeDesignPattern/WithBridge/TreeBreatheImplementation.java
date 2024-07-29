package BridgeDesignPattern.WithBridge;

public class TreeBreatheImplementation implements BreatheImplementor{

	@Override
	public void breathe() {
		System.out.println("Breathe through leaf\nInhale CO2 and exhale O2 during photosynthesis");
	}

}
