package NullObjectPattern;

public class PetDog implements PetAnimal{

	@Override
	public void characteristic() {
		System.out.println("Dog is obedient animal.");
	}

	@Override
	public int legCount() {
		return 4;
	}
	
}
