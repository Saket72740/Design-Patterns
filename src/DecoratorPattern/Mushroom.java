package DecoratorPattern;

public class Mushroom extends ToppingDecorator{

	BasePizza basePizza;
	
	public Mushroom(BasePizza pizza) {
		this.basePizza = pizza;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost() + 15;
	}

}
