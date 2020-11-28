import questions.Circle;
import questions.Rectangle;
import questions.Shape;
import questions.decorators.ColoredBorderDecorator;
import questions.decorators.LineDecorator;
import questions.enums.Color;

public class Test {
	
	public static void main(String[] args) {

        System.out.println("Creating Simple Shape Objects...");
        Shape simpleRectangule = new Rectangle();
        Shape simpleCircle = new Circle();

        System.out.println("Drawing Simple Shape Objects...");
        simpleRectangule.draw();
        
        System.out.println();
        simpleCircle.draw();
        System.out.println();
        
        System.out.println("Creating Decorated Rectange with Blue Color anbd line thickness of 5.");
        Shape decRectangle1 = new LineDecorator(new ColoredBorderDecorator(new Rectangle(), Color.BLUE), 5);
        decRectangle1.draw();
        System.out.println();

        System.out.println("Creating Decorated Circle with Blue Color and line thickness of 3.");
        Shape decCircle1 = new ColoredBorderDecorator(new LineDecorator(new Circle(), 1), Color.BLACK);
        decCircle1.draw();
        System.out.println();
        
        // order of decorator is also not much important here since all are unique functionalities.
        // we can also do this nesting of functionalities in separate statements.
        System.out.println("Creating Decorated Circle with Red Color and line thickness of 2.");
        Circle circle = new Circle();
        LineDecorator ld = new LineDecorator(circle, 2);
        ColoredBorderDecorator ls = new ColoredBorderDecorator(ld, Color.RED);

        Shape decCircle2 = ls;
        decCircle2.draw();
        System.out.println();

  }
}
