package CouponDiscountSystemDesign;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {
	
	Product product;
	int discountPercentage;
	ProductType type;
	
	static List<ProductType> eligibleType = new ArrayList<>();
	
	static {
		eligibleType.add(ProductType.FURNITURE_GOODS);
		eligibleType.add(ProductType.DECORATIVE_GOODS);
	}
	
	public TypeCouponDecorator(Product product, int percentage, ProductType type) {
		this.product = product;
		this.discountPercentage = percentage;
		this.type = type;
	}
	
	@Override
	public double getPrice() {
		double price = product.getPrice();
		if(eligibleType.contains(type)) {
			return price - (price * discountPercentage)/100; 
		}
		return price;
	}

}
