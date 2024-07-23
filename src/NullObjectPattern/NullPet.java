package NullObjectPattern;

public class NullPet implements PetAnimal{

	@Override
	public void characteristic() {
		System.out.println("Sorry! We don't have this pet with us.");
	}

}
