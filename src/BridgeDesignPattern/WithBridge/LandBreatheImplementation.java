package BridgeDesignPattern.WithBridge;

public class LandBreatheImplementation implements BreatheImplementor{

	@Override
	public void breathe() {
		System.out.println("Breathe through NOSE\nInhale O2 Exhale CO2");
	}

}
