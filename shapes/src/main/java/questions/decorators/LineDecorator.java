package questions.decorators;

import questions.Shape;

public class LineDecorator extends ShapeDecorator{

	protected Integer thickness;
	
	public LineDecorator(Shape decoratedShape, Integer thickness) {
		super(decoratedShape);
		this.thickness = thickness;
	}

	@Override
	public String draw() {
		return decoratedShape.draw() + " with line thickness: "+thickness;
	}

}
