package NullObjectPattern;

public class CatPet implements PetAnimal{

	@Override
	public void characteristic() {
		System.out.println("Cat has power to generate static energy on rubbing its hair");
	}
	
	public void getLegs() {
		System.out.println("Cat has 4 legs");
	}

	@Override
	public int legCount() {
		return 4;
	}
}
