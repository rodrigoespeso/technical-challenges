package questions;

import java.util.function.BinaryOperator;

public interface CommonOperations{
	
	// Addition
	final static BinaryOperator<Integer> addition = (a, b) -> a+b;
	
	// Product
	final static BinaryOperator<Integer> product = (a, b) -> a*b;
}
