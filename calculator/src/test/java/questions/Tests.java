package questions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.function.BinaryOperator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Tests {
	
	
	/*
	 * The method-chaining can be used to perform a calculation in a single statement
	 * as a postfix calculator. The Node class is limited to execute operations over 2 numbers only.
	 */
	@Test
	public void calculateNode_mixedOperations_PostFixAndChainingApproach() { // The result always will be saved on the left node
		// Given
		BinaryOperator<Double> subtraction = CalculatorOperations.subtraction; // Not predefined operations could be used
		BinaryOperator<Double> addition = CalculatorOperations.addition;
		BinaryOperator<Double> product = CalculatorOperations.product;
		
		Double result = new Node(new Node(5.0))
				.addRight(6.0)
				.operate(product) // 5 * 6 
				.addRight(9.0)	
				.operate(addition) // + 9
				.addRight(7.0)
				.operate(subtraction).getResult();	// - 7 = 32
		assertEquals(Double.valueOf(32), result);
	}
	
	@Test
	public void calculateNode_mixedOperations_PostFixAndChainingApproach_Case2() {
		// Given
		BinaryOperator<Double> subtraction = CalculatorOperations.subtraction;
		BinaryOperator<Double> division = CalculatorOperations.division;
		BinaryOperator<Double> addition = CalculatorOperations.addition;
		BinaryOperator<Double> product = CalculatorOperations.product;
		
		Double result = new Node(new Node(8.0))
				.addRight(1.0)
				.operate(addition) // [(8 + 1)
				.addRight(9.0)	
				.operate(product) // * 9
				.addRight(6.0)
				.operate(subtraction) // - 6 ]
				.addRight(3.0)
				.operate(division).getResult();	// / 3 = 	
		assertEquals(Double.valueOf(25), result);
	}
	
	@Test
	public void calculateNode_simpleValue() {
		// Given
		Node one = new Node(1.0);
		// Then
		assertEquals(Double.valueOf(1), one.calculate().getValue());
	}
	
	@Test
	public void calculateNode_additionWithoutLeftAndRightNodes() {
		// Given
		Node addition = new Node(CalculatorOperations.addition); // inherited from CommonOperations
		assertNull(addition.calculate().getValue());
	}
	
	@Test
	public void calculateNode_productWithoutLeftAndRightNodes() {
		// Given
		Node product = new Node(CalculatorOperations.product); // inherited from CommonOperations
		// Then
		assertNull(product.calculate().getValue());
	}
	
	@Test
	public void calculateNode_addition() {
		// Given
		Node addition = new Node(CalculatorOperations.addition); 
		addition.setLeftNode(new Node(2.0));
		addition.setRightNode(new Node(3.0));
		// Then
		assertEquals(Double.valueOf(5), addition.calculate().getValue());
	}
	
	@Test
	public void calculateNode_product() {
		// Given
		Node product = new Node(CalculatorOperations.product);
		product.setLeftNode(new Node(3.0));
		product.setRightNode(new Node(7.0));
		// Then
		assertEquals(Double.valueOf(21), product.calculate().getValue());
	}
	
	@Test
	public void calculateNode_productAndAddition() { // 2 * 5 + 3 = 13
		// Given
		Node product = new Node(CalculatorOperations.product, new Node(2.0), new Node(5.0));
		Node result = new Node(CalculatorOperations.addition, product, new Node(3.0));
		// Then
		assertEquals(Double.valueOf(13), result.calculate().getValue());
	}
	
	@Test
	public void calculateNode_AdditionAndProduct() { // 2 * (5 + 3) = 16 
		// Given
		Node addition = new Node(CalculatorOperations.addition, new Node(5.0), new Node(3.0));
		Node result = new Node(CalculatorOperations.product, addition, new Node(2.0));
		// Then
		assertEquals(Double.valueOf(16), result.calculate().getValue());
	}
	
	@Test
	public void calculateNode_subtraction() {
		// Given
		Node subtraction = new Node(CalculatorOperations.subtraction, new Node(10.0), new Node(4.0));
		// Then
		assertEquals(Double.valueOf(6), subtraction.calculate().getValue());
	}
	
	@Test
	public void calculateNode_division() {
		// Given
		Node division = new Node(CalculatorOperations.division, new Node(15.0), new Node(3.0));
		// Then
		assertEquals(Double.valueOf(5), division.calculate().getValue());
	}
	
	@Test
	public void calculateNode_mixedOperations() {
		// Given
		BinaryOperator<Double> subtraction = CalculatorOperations.subtraction;
		BinaryOperator<Double> division = CalculatorOperations.division;
		BinaryOperator<Double> addition = CalculatorOperations.addition;
		BinaryOperator<Double> product = CalculatorOperations.product;
		
		Node three = new Node(3.0);
		Node five = new Node(5.0);
		Node seven = new Node(7.0);
		
		Node additionResult = new Node(addition, three, seven); // 3 + 7 = 10
		Node subtractionResult = new Node(subtraction, five, three); // 5 + 3 = 2
		Node productResult = new Node(product, additionResult, subtractionResult); // 10 * 2 = 20 
		Node divisionResult = new Node(division, productResult, five); // 20 / 5 = 4
		// Then
		assertEquals(Double.valueOf(10), additionResult.calculate().getValue());
		assertEquals(Double.valueOf(2), subtractionResult.calculate().getValue());
		assertEquals(Double.valueOf(20), productResult.calculate().getValue());
		assertEquals(Double.valueOf(4), divisionResult.calculate().getValue());
	}
	
}
