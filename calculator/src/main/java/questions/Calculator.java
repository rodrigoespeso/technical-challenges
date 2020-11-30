package questions;

/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    Background:
    This calculator uses a single Node class to create a tree structure that is used to perform
    mathematical operations. Operations are performed in the Node.calculate() method.  Currently only
    addition and multiplication is supported.

    The problem:
    Now we want to make this calculator extensible, so that other developers can add new operations.
    Modify this class structure so that external can add new operations while respecting good OO
    practices.
    We should be able to distribute this code as a compiled .jar and developers should be able
    to add new types of operations at runtime.  As an example, demonstrate how subtraction would be added.

*/
public class Calculator {

    public void run() {
        // 2 + 3 * 4
        Node times = new Node(CommonOperations.product, 0d);
        Node three = new Node(null, 3d);
        Node four = new Node(null, 4d);

        // first 3 * 4
        times.setLeftNode(three);
        times.setRightNode(four);

        // then 2 + result above
        Node two = new Node(null, 2d);
        Node plus = new Node(CommonOperations.addition, 0d);

        plus.setLeftNode(two);
        plus.setRightNode(times);
        System.out.println(plus.calculate());
    }

    public static void main(String... args) {
        Calculator c = new Calculator();
        c.run();
    }
}
