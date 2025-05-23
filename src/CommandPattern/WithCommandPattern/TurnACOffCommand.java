package CommandPattern.WithCommandPattern;

import CommandPattern.WithoutCommandPattern.AirConditioner;

public class TurnACOffCommand implements ICommand{

	AirConditioner ac;

	public TurnACOffCommand(AirConditioner ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOffAC();
	}

	@Override
	public void undo() {
		ac.turnOnAC();
	}
	
}
