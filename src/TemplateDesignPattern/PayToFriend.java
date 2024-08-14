package TemplateDesignPattern;

public class PayToFriend extends PaymentFlow {

	@Override
	public void validateRequest() {
		// specific validation for PayToFriend flow
		System.out.println("Validate logic of Pay to Friend");
	}

	@Override
	public void calculateFees() {
		// specific Fee computation logic for Pay to Friend flow
		System.out.println("0% fee charged");
	}

	@Override
	public void debitAmount() {
		// debit the amount
		System.out.println("Debit the amount logic of Pay to Friend");
	}

	@Override
	public void creditAmount() {
		// credit the amount logic
		System.out.println("Credit the full amount");
	}

}
