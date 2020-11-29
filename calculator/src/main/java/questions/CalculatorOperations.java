package questions;

import java.util.function.BinaryOperator;

public class CalculatorOperations implements CommonOperations {
	
	// Subtraction
	final static BinaryOperator<Integer> subtraction = (a, b) -> a-b;
	
	// Division
	final static BinaryOperator<Integer> division = (a, b) -> a/b;
}
