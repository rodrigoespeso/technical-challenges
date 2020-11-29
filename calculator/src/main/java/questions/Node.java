package questions;

import java.util.function.BinaryOperator;

public class Node{
    BinaryOperator<Integer> operator;
    Integer value;
    Node leftNode;
    Node rightNode;
    
    public Node() {}
    
    public Node(BinaryOperator<Integer> operator, int value) {
    	this.operator = operator;
    	this.value = value;
    }
    
    public Node(int value) {
    	this.operator = null;
    	this.value = value;
    }
    
    public Node(BinaryOperator<Integer> operator) {
    	this.operator = operator;
    	this.value = 0;
    }
    
    public Node(Node leftNode) {
    	this.leftNode = leftNode;
    }
    
    public Node(Node leftNode, Node rightNode) {
    	this.leftNode = leftNode;
    	this.rightNode = rightNode;
    }
    
    public Node(BinaryOperator<Integer> operator, Node leftNode, Node rightNode) {
		this.operator = operator;
		this.value = 0;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public Node calculate() {
        if (null != operator && null != leftNode && null != rightNode) {
            return new Node(operator.apply(leftNode.calculate().getValue(), 
            		rightNode.calculate().getValue()));
        }
        return new Node(value);
    }

	public Node addLeft(Integer i) {
		this.leftNode = new Node(i);
		return this;
	}
	
	public Node addRight(Integer i) {
		this.rightNode = new Node(i);
		return this;
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
    	return String.valueOf(value);
    }

	public Node operate(BinaryOperator<Integer> operator) {
        this.operator = operator;
        return new Node(calculate(), null);
	}
	
	public Integer getResult() {
		return getLeftNode().getValue();
	}
}
