package questions.decorators;

import questions.Shape;

public class LineDecorator extends ShapeDecorator{

	protected Integer thickness;
	
	public LineDecorator(Shape decoratedShape, Integer thickness) {
		super(decoratedShape);
		this.thickness = thickness;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Drew with line thickness: "+thickness);
		
	}

}
