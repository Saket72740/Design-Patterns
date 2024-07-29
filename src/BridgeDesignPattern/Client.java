package BridgeDesignPattern;

import BridgeDesignPattern.WithBridge.BreatheImplementor;
import BridgeDesignPattern.WithBridge.Dog;
import BridgeDesignPattern.WithBridge.Fish;
import BridgeDesignPattern.WithBridge.LandBreatheImplementation;
import BridgeDesignPattern.WithBridge.LivingThings;
import BridgeDesignPattern.WithBridge.Tree;
import BridgeDesignPattern.WithBridge.TreeBreatheImplementation;
import BridgeDesignPattern.WithBridge.WaterBreatheImplementation;

//import BridgeDesignPattern.WithoutBridge.Dog;
//import BridgeDesignPattern.WithoutBridge.Fish;
//import BridgeDesignPattern.WithoutBridge.LivingThings;
//import BridgeDesignPattern.WithoutBridge.Tree;

public class Client {
	
	public static void main(String[] args) {
		
//		LivingThings livingthingLand = new Dog();
//		livingthingLand.bretheProcess();
//		System.out.println();
//		LivingThings livingthingWater = new Fish();
//		livingthingWater.bretheProcess();
//		System.out.println();
//		LivingThings livingthingTree = new Tree();
//		livingthingTree.bretheProcess();
		
		BreatheImplementor breatheImplementorL = new LandBreatheImplementation();
		BreatheImplementor breatheImplementorW = new WaterBreatheImplementation();
		BreatheImplementor breatheImplementorT = new TreeBreatheImplementation();
		LivingThings livingthingLand = new Dog(breatheImplementorL);
		livingthingLand.breatheProcess();
		System.out.println();
		LivingThings livingthingWater = new Fish(breatheImplementorW);
		livingthingWater.breatheProcess();
		System.out.println();
		LivingThings livingthingTree = new Tree(breatheImplementorT);
		livingthingTree.breatheProcess();
	}

}
