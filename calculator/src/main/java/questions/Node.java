package questions;

public class Node {
    String operator;
    int value;
    Node leftNode;
    Node rightNode;

    public int calculate() {
        if ("+".equals(operator)) {
            return leftNode.calculate()+rightNode.calculate();
        }
        if ("*".equals(operator)) {
            return leftNode.calculate()*rightNode.calculate();
        }
        return value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
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

    public Node(String operator, int value) {
        this.operator = operator;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
