package CompositeDesignPattern;

import CompositeDesignPattern.ArithmeticExpression.ArithmeticExpression;
import CompositeDesignPattern.ArithmeticExpression.Expression;
import CompositeDesignPattern.ArithmeticExpression.Number;
import CompositeDesignPattern.ArithmeticExpression.Operation;
import CompositeDesignPattern.FileDirectorySystem.Directory;
import CompositeDesignPattern.FileDirectorySystem.File;
import CompositeDesignPattern.FileDirectorySystem.FileSystem;

public class Main {

	public static void main(String[] args) {
		Directory movieDirectory = new Directory("Movie");
		FileSystem border = new File("Border");
		movieDirectory.add(border);
		Directory comedyDirectory = new Directory("Comedy Movie");
		File hulchul = new File("Hulchul");
		comedyDirectory.add(hulchul);
		movieDirectory.add(comedyDirectory);
		movieDirectory.ls();
		
		//2*(1+7)

	       /*

	                         *
	                       /   \
	                     2      +
	                           / \
	                          1   7

	        */


        ArithmeticExpression two = new Number(2);

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(one,seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two,addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());

	}
}
