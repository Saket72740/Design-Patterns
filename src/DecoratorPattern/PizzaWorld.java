package DecoratorPattern;

public class PizzaWorld {

	public static void main(String[] args) {
		ToppingDecorator pizza = new Mushroom(new ExtraCheese(new Margharita()));
		System.out.println(pizza.cost());
	}
	
}
