package TemplateDesignPattern;

public class Client {

	public static void main(String[] args) {
		
		PaymentFlow paymentObj = new PayToFriend();
		paymentObj.sendMoney();
		
		PaymentFlow paymentObj2 = new PayToMerchantFlow();
		paymentObj2.sendMoney();
	}
}
