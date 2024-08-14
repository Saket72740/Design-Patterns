package InterpreterDesignPattern;

public class MultiplyNonTerminalExpression implements AbstractExpression{

	AbstractExpression leftExpression;
	AbstractExpression rightExpression;
	
	public MultiplyNonTerminalExpression(AbstractExpression numberTerminalExpression,
			AbstractExpression numberTerminalExpression2) {
		this.leftExpression = numberTerminalExpression;
		this.rightExpression = numberTerminalExpression2;
	}

	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) * rightExpression.interpret(context);
	}

	
}
