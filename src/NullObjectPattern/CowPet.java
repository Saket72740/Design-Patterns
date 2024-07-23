package NullObjectPattern;

public class CowPet implements PetAnimal{

	@Override
	public void characteristic() {
		System.out.println("Cow is a very innocent animal and give us milk");
	}

	public void getLegs() {
		System.out.println("Cat has 4 legs");
	}

	@Override
	public int legCount() {
		// TODO Auto-generated method stub
		return 4;
	}
}
