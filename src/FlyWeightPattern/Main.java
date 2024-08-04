package FlyWeightPattern;

import FlyWeightPattern.Character.WithFlyWeight.ILetter;
import FlyWeightPattern.Character.WithFlyWeight.LetterFactory;
import FlyWeightPattern.Character.WithoutFlyWeight.Character;
import FlyWeightPattern.WithFlyWeight.IRobot;
import FlyWeightPattern.WithFlyWeight.RoboticFactory;
import FlyWeightPattern.WithoutFlyWeight.Robot;
import FlyWeightPattern.WithoutFlyWeight.Sprites;

public class Main {

	public static void main(String[] args) {
		
		//Example 1
		
		// without using Flyweight pattern
//		int x = 0;
//		int y = 0;
//		for(int i=0;i<500000;i++) {
//			Sprites humanoidSprite = new Sprites();
//			Robot humanoidRobotObj =  new Robot(x+i, y+i, "HUMANOID", humanoidSprite);
//		}
//		for(int i=0;i<500000;i++) {
//			Sprites roboticDogSprite = new Sprites();
//			Robot roboticDogRobotObj = new Robot(x+i, y+i, "ROBOTIC_DOGS", roboticDogSprite);
//		}
		
		// using Flyweight pattern
		IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
		humanoidRobot1.display(1, 2);
		
		IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
		humanoidRobot2.display(10, 30);
		
		IRobot robotDog1 = RoboticFactory.createRobot("ROBOTICDOG");
		robotDog1.display(2, 9);
		
		IRobot robotDog2 = RoboticFactory.createRobot("ROBOTICDOG");
		robotDog2.display(11, 19);
		
		//Example 2
		
		/*
			this is the data we want to write into the word processor.
			
			Total = 58 characters
			t = 7 times
			h = 3 times
			a = 3 times and so on...
		*/
		
		// without using Flyweight Pattern
//		Character object1 = new Character('t', "Arial", 10, 0, 0);
//		Character object2 = new Character('h', "Arial", 10, 0, 1);
//		Character object3 = new Character('i', "Arial", 10, 0, 2);
//		Character object4 = new Character('s', "Arial", 10, 0, 3);
		
		// using Flyweight Pattern
		ILetter object1 = LetterFactory.createLetter('t');
		object1.display(0, 0);
		
		ILetter object2 = LetterFactory.createLetter('t');
		object2.display(0, 6);
	}
	
	
}
