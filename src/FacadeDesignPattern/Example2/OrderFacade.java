package FacadeDesignPattern.Example2;

public class OrderFacade {

	ProductDAO productDao;
	Invoice invoice;
	Payment payment;
	SendNotification notification;
	
	public OrderFacade() {
		this.productDao = new ProductDAO();
		this.invoice = new Invoice();
		this.payment = new Payment();
		this.notification = new SendNotification();
	}
	
	public void createOrder() {
		Product product = productDao.getProduct(121);
		payment.makePayment();
		invoice.generateInvoice();
		notification.sendNotification();
	}
}
