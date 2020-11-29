package questions;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertSame;

import java.util.List;
import java.util.function.BinaryOperator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Tests {
	
	@Test
	public void calculateNode_simpleValue() {
		// Given
		Node one = new Node(1);
		// Then
		assertSame(1, one.calculate().getValue());
	}
	
	@Test
	public void calculateNode_additionWithoutLeftAndRightNodes() {
		// Given
		Node addition = new Node(CommonOperations.addition);
		assertSame(0, addition.calculate().getValue());
	}
	
	@Test
	public void calculateNode_productWithoutLeftAndRightNodes() {
		// Given
		Node product = new Node(CommonOperations.product);
		// Then
		assertSame(0, product.calculate().getValue());
	}
	
	@Test
	public void calculateNode_additionWithLeftAndRightNodes() {
		// Given
		Node addition = new Node(CommonOperations.addition);
		addition.setLeftNode(new Node(2));
		addition.setRightNode(new Node(3));
		// Then
		assertSame(5, addition.calculate().getValue());
	}
	
	@Test
	public void calculateNode_productWithLeftAndRightNodes() {
		// Given
		Node product = new Node(CommonOperations.product);
		product.setLeftNode(new Node(3));
		product.setRightNode(new Node(7));
		// Then
		assertSame(21, product.calculate().getValue());
	}
	
	@Test
	public void calculateNode_productAndAddition() { // 2 * 5 + 3 = 13
		// Given
		Node product = new Node(CommonOperations.product, new Node(2), new Node(5));
		Node result = new Node(CommonOperations.addition, product, new Node(3));
		// Then
		assertSame(13, result.calculate().getValue());
	}
	
	@Test
	public void calculateNode_AdditionAndProduct() { // 2 * (5 + 3) = 16 
		// Given
		Node addition = new Node(CommonOperations.addition, new Node(5), new Node(3));
		Node result = new Node(CommonOperations.product, addition, new Node(2));
		// Then
		assertSame(16, result.calculate().getValue());
	}
	
	@Test
	public void calculateNode_subtraction() {
		// Given
		Node subtraction = new Node((a, b) -> a-b, new Node(10), new Node(4));
		// Then
		assertSame(6, subtraction.calculate().getValue());
	}
	
	@Test
	public void calculateNode_division() {
		// Given
		Node division = new Node((a, b) -> a/b, new Node(15), new Node(3));
		// Then
		assertSame(5, division.calculate().getValue());
	}
	
	@Test
	public void calculateNode_mixedOperations() {
		// Given
		BinaryOperator<Integer> subtraction = (a, b) -> a-b;
		BinaryOperator<Integer> division = (a, b) -> a/b;
		BinaryOperator<Integer> addition = CommonOperations.addition;
		BinaryOperator<Integer> product = CommonOperations.product;
		
		Node three = new Node(3);
		Node five = new Node(5);
		Node seven = new Node(7);
		
		Node additionResult = new Node(addition, three, seven); // 3 + 7 = 10
		Node subtractionResult = new Node(subtraction, five, three); // 5 + 3 = 2
		Node productResult = new Node(product, additionResult, subtractionResult); // 10 * 2 = 20 
		Node divisionResult = new Node(division, productResult, five); // 20 / 5 = 4
		// Then
		assertSame(10, additionResult.calculate().getValue());
		assertSame(2, subtractionResult.calculate().getValue());
		assertSame(20, productResult.calculate().getValue());
		assertSame(4, divisionResult.calculate().getValue());
	}
	
}
