package NullObjectPattern;

public class FindPet {

	public PetAnimal getPetDetail(String typeOfAnimal) {
		
		if("COW".equals(typeOfAnimal))
			return new CowPet();
		else if("CAT".equals(typeOfAnimal))
			return new CatPet();
		else if("DOG".equals(typeOfAnimal))
			return new PetDog();
		return new NullPet();
	}
	
}
