package questions;

import java.util.function.BinaryOperator;

/*
 * Here we can add our own operations.
 */
public class CalculatorOperations implements CommonOperations {
	
	// Subtraction
	final static BinaryOperator<Double> subtraction = (a, b) -> a-b;
	
	// Division
	final static BinaryOperator<Double> division = (a, b) -> a/b;
}
