package questions.decorators;

import questions.Shape;

public class ShapeDecorator implements Shape{

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		System.out.println("I'm drawing myself...");
	}

}
