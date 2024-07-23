package NullObjectPattern;

public class Main {

	public static void main(String[] args) {
		FindPet findPet = new FindPet();
		findPet.getPetDetail("COW").characteristic();
		findPet.getPetDetail("CAT").characteristic();
		findPet.getPetDetail("DOG").characteristic();
		findPet.getPetDetail("LION").characteristic();
	}
}
