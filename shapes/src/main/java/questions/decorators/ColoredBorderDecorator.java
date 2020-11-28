package questions.decorators;

import questions.Shape;
import questions.enums.Color;

public class ColoredBorderDecorator extends ShapeDecorator{

	protected Color border;
	
	public ColoredBorderDecorator(Shape decoratedShape, Color border) {
		super(decoratedShape);
		this.border = border;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Drew with colored border: "+border);
	}

}
