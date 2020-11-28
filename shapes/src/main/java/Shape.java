
/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    Background: We have a Shape abstract class that represents geometric shapes.
    With the draw() method the shape can draw itself, so a Rectangle can extend Shape and implement
    it's own draw() method.

    The problem:  We want to add additional behaviour to the draw method, e.g. draw with a red border
    or draw with a thick pen.  And we want to add this behaviour at runtime, not compile time. i.e.
    If we package this class structure as a .jar then an external developer should be able to add new
    type of behaviour to draw, without changing our existing code.
    Design the class structure to support this.

 */
public abstract class Shape {
    abstract void draw();
}
