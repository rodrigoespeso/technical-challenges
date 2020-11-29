package questions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import questions.decorators.ColoredBorderDecorator;
import questions.decorators.LineDecorator;
import questions.decorators.ShapeDecorator;
import questions.enums.Color;

@RunWith(JUnit4.class)
public class Tests {

	@Test
	public void drawCircleSimpleShape() {
		// Given
		Shape circle = new Circle();
		// Then
		assertEquals("CIRCLE DRAWING", circle.draw());
	}
	
	@Test
	public void drawRectangleSimpleShape() {
		// Given
		Shape rectangle = new Rectangle();
		// Then
		assertEquals("RECTANGLE DRAWING", rectangle.draw());
	}
	
	@Test
	public void drawCircleWithRedBorder() {
		// Given
		Shape coloredCircle = new ColoredBorderDecorator(new Circle(), Color.RED);
		// Then
		assertEquals("CIRCLE DRAWING with colored border: RED", coloredCircle.draw());
	}
	
	@Test
	public void drawCircleWithBlueBorder() {
		// Given
		Shape coloredCircle = new ColoredBorderDecorator(new Circle(), Color.BLUE);
		// Then
		assertEquals("CIRCLE DRAWING with colored border: BLUE", coloredCircle.draw());
	}
	
	@Test
	public void drawCircleWithBlackBorder() {
		// Given
		Shape coloredCircle = new ColoredBorderDecorator(new Circle(), Color.BLACK);
		// Then
		assertEquals("CIRCLE DRAWING with colored border: BLACK", coloredCircle.draw());
	}
	
	@Test
	public void drawRectangleWithRedBorder() {
		// Given
		Shape coloredRectangle = new ColoredBorderDecorator(new Rectangle(), Color.RED);
		// Then
		assertEquals("RECTANGLE DRAWING with colored border: RED", coloredRectangle.draw());
	}
	
	@Test
	public void drawRectangleWithBlueBorder() {
		// Given
		Shape coloredRectangle = new ColoredBorderDecorator(new Rectangle(), Color.BLUE);
		// Then
		assertEquals("RECTANGLE DRAWING with colored border: BLUE", coloredRectangle.draw());
	}
	
	@Test
	public void drawRectangleWithBlackBorder() {
		// Given
		Shape coloredRectangle = new ColoredBorderDecorator(new Rectangle(), Color.BLACK);
		// Then
		assertEquals("RECTANGLE DRAWING with colored border: BLACK", coloredRectangle.draw());
	}
	
	@Test
	public void drawCircleWithThickLine() {
		// Given
		Shape linedCircle = new LineDecorator(new Circle(), 20);
		// Then
		assertEquals("CIRCLE DRAWING with line thickness: 20", linedCircle.draw());
	}

	@Test
	public void drawRectangleWithThickLine() {
		// Given
		Shape linedRectangle = new LineDecorator(new Rectangle(), 5);
		// Then
		assertEquals("RECTANGLE DRAWING with line thickness: 5", linedRectangle.draw());
	}
	
	@Test
	public void drawCircleWithBorderColorAndThickLine() {
		// Given
		Shape linedRectangle = new LineDecorator(new ColoredBorderDecorator(new Circle(), Color.RED), 5);
		// Then
		assertEquals("CIRCLE DRAWING with colored border: RED with line thickness: 5", linedRectangle.draw());
	}
	
	// Same as the last one but with inverted order
	@Test
	public void drawCircleWithThickLineAndBoderColor() {
		// Given
		Shape linedRectangle = new ColoredBorderDecorator(new LineDecorator(new Circle(), 5), Color.RED);
		// Then
		assertEquals("CIRCLE DRAWING with line thickness: 5 with colored border: RED", linedRectangle.draw());
	}
	
	@Test
	public void drawRectangleWithBorderColorAndThickLine() {
		// Given
		Shape linedRectangle = new LineDecorator(new ColoredBorderDecorator(new Rectangle(), Color.RED), 5);
		// Then
		assertEquals("RECTANGLE DRAWING with colored border: RED with line thickness: 5", linedRectangle.draw());
	}
	
	// Same as the last one but with inverted order
	@Test
	public void drawRectangleWithThickLineAndBoderColor() {
		// Given
		Shape linedRectangle = new ColoredBorderDecorator(new LineDecorator(new Rectangle(), 5), Color.RED);
		// Then
		assertEquals("RECTANGLE DRAWING with line thickness: 5 with colored border: RED", linedRectangle.draw());

	}

	
}
