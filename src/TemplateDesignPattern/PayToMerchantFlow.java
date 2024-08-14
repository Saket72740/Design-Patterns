package TemplateDesignPattern;

public class PayToMerchantFlow extends PaymentFlow{

	@Override
	public void validateRequest() {
		// specific validation for Pay To Merchant flow
		System.out.println("Validate logic of Pay to Merchant");
	}

	@Override
	public void calculateFees() {
		// specific Fee computation logic for Pay to Merchant flow
		System.out.println("2% fees charged");
	}

	@Override
	public void debitAmount() {
		// debit the amount
		System.out.println("Debit the amount logic of Pay to Merchant");
	}

	@Override
	public void creditAmount() {
		// credit the amount logic
		System.out.println("Credit the full amount");
	}

}
