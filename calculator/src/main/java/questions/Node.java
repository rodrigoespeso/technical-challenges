package questions;

import java.util.function.BinaryOperator;

public class Node{
    BinaryOperator<Integer> operator;
    Integer value;
    Node leftNode;
    Node rightNode;

    public int calculate() {
        if (operator != null) {
            return operator.apply(leftNode.calculate(), rightNode.calculate());
        }
        return value;
    }

    public BinaryOperator<Integer> getOperator() {
        return operator;
    }

    public void setOperator(BinaryOperator<Integer> operator) {
        this.operator = operator;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node(BinaryOperator<Integer> operator, int value) {
        this.operator = operator;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
