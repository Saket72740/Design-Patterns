package CouponDiscountSystemDesign;

public class Client {

	public static void main(String[] args) {
		
		Product product1 = new Item1("FAN", 1000, ProductType.ELECTRONIC_ITEM);
		Product product2 = new Item2("SOFA", 2000, ProductType.FURNITURE_GOODS);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(product1);
		cart.addToCart(product2);
		
		System.out.println("Total Price after discount: " + cart.getTotalPrice());
	}
}
