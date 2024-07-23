package NullObjectPattern;

public class FindPet {

	public PetAnimal getPetDetail(String animal) {
		
		switch (animal) {
			case "CAT":
				return new CatPet();
			case "COW":
				return new CowPet();
			case "DOG":
				return new PetDog();
			default:
				return new NullPet();
		}
	}
	
}
