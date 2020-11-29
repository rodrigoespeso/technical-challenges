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
	public String draw() {
		return decoratedShape.draw() + " with colored border: "+border;
		
	}

}
