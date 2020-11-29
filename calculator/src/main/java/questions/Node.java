package questions;

import java.util.function.BinaryOperator;

public class Node{
    BinaryOperator<Double> operator;
    Double value;
    Node leftNode;
    Node rightNode;
    
    public Node() {}
    
    public Node(BinaryOperator<Double> operator, Double value) {
    	this.operator = operator;
    	this.value = value;
    }
    
    public Node(Double value) {
    	this.operator = null;
    	this.value = value;
    }
    
    public Node(BinaryOperator<Double> operator) {
    	this.operator = operator;
    }
    
    public Node(Node leftNode) {
    	this.leftNode = leftNode;
    }
    
    public Node(Node leftNode, Node rightNode) {
    	this.leftNode = leftNode;
    	this.rightNode = rightNode;
    }
    
    public Node(BinaryOperator<Double> operator, Node leftNode, Node rightNode) {
		this.operator = operator;
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
	
	/**
	 * Set the left node with a new node from given Double
	 * @param i The {@link Double} value
	 * @return This node
	 */
	public Node addLeft(Double i) {
		this.leftNode = new Node(i);
		return this;
	}
	
	/**
	 * Set the right node with a new node from given Double
	 * @param i The {@link Double} value
	 * @return This node
	 */
	public Node addRight(Double i) {
		this.rightNode = new Node(i);
		return this;
	}
	
	/**
	 * Set this operator with the given one, performs operation and return new node.
	 * The result of the operation is set to the left node of the returned one.
	 * 
	 * @param operator A {@link BiFunction} predefined operation
	 * @return New Node with he calculated value
	 */
	public Node operate(BinaryOperator<Double> operator) {
		this.operator = operator;
		return new Node(calculate(), null);
	}
	
	/**
	 * The final result of the operation chaining will be store as the value of the
	 * left node.
	 * 
	 * @return The {@link Double} value.
	 */
	public Double getResult() {
		return getLeftNode().getValue();
	}
	
    public BinaryOperator<Double> getOperator() {
        return operator;
    }

    public void setOperator(BinaryOperator<Double> operator) {
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
