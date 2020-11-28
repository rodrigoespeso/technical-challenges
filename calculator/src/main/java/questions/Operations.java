package questions;

import java.util.function.BinaryOperator;

public interface Operations{
	
	// Addition
	static BinaryOperator<Integer> addition = (a, b) -> a+b;
	
	// Product
	static BinaryOperator<Integer> product = (a, b) -> a*b;
}
