package CouponDiscountSystemDesign;

public class Item1 extends Product{

	Item1(String name, double originalPrice, ProductType product){
		super(name, originalPrice, product);
	}
	
	@Override
	public double getPrice() {
		return originalPrice;
	}
	
	

}
