package FlyWeightPattern.WithFlyWeight;

public class HumanoidRobot implements IRobot{

	private String type;
	private Sprites body;
	
	HumanoidRobot(String type, Sprites body){
		this.type = type;
		this.body = body;
	}
	
	public String getType() {
		return type;
	}

	public Sprites getBody() {
		return this.body;
	}

	@Override
	public void display(int x, int y) {
		// use the Robotic Dog sprites object
		// and X and Y coordinate to render the image.
	}
	
	

}
