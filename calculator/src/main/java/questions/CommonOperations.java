package questions;

import java.util.function.BinaryOperator;

public interface CommonOperations{
	
	// Addition
	final static BinaryOperator<Double> addition = (a, b) -> a+b;
	
	// Product
	final static BinaryOperator<Double> product = (a, b) -> a*b;
}
