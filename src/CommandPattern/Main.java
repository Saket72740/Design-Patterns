package CommandPattern;

import CommandPattern.WithCommandPattern.MyRemoteControl;
import CommandPattern.WithCommandPattern.TurnACOffCommand;
import CommandPattern.WithCommandPattern.TurnACOnCommand;
import CommandPattern.WithoutCommandPattern.AirConditioner;

public class Main {

	public static void main(String[] args) {
		
		// Without using the Command Pattern
		
//		AirConditioner ac = new AirConditioner();
//		ac.turnOnAC();
//		ac.setTemperature(24);
//		ac.turnOffAC();
		
		
		// By using the Command Pattern
		
		//AC object
		AirConditioner airConditioner = new AirConditioner();
		
		//remote		
		MyRemoteControl remoteObj = new MyRemoteControl();
		
		//create the command and press the button
		remoteObj.setCommand(new TurnACOnCommand(airConditioner));
		remoteObj.pressButton();
		
	}
}
