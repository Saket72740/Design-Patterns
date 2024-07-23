package NullObjectPattern;

public class Main {

	public static void main(String[] args) {
		FindPet findPet = new FindPet();
		findPet.getPetDetail("COW").characteristic();
		System.out.println(findPet.getPetDetail("COW").legCount());
		findPet.getPetDetail("CAT").characteristic();
		System.out.println(findPet.getPetDetail("CAT").legCount());
		findPet.getPetDetail("DOG").characteristic();
		System.out.println(findPet.getPetDetail("DOG").legCount());
		findPet.getPetDetail("LION").characteristic();
	}
}
