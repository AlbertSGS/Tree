package tree;

public class Node {
	
	private String aElement = "";
	
	private Node aParent;
	private Node aLeftChild;
	private Node aRightChild;
	
	public Node(String pElement, Node pParent, Node pLeftChild, Node pRightChild) {
		this.aElement = pElement;
		this.aParent = pParent;
		this.aLeftChild = pLeftChild;
		this.aRightChild = pRightChild;
	}

	public void setElement(String pElement) {
		this.aElement = pElement;
	}

	public String getElement() {
		return this.aElement;
	}
	
	public void setParent(Node pParent) {
		this.aParent = pParent;
	}
	
	public Node getParent() {
		return this.aParent;
	}
	
	public void setLeft(Node pLeft) {
		this.aLeftChild = pLeft;
	}
	
	public Node getLeft() {
		return this.aLeftChild;
	}
	
	public void setRight(Node pRight) {
		this.aLeftChild = pRight;
	}
	
	public Node getRight() {
		return this.aRightChild;
	}
	
	public String traverse(TraversalMethod pMethod) {
		return pMethod.traversal(this);
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + this.getElement().hashCode();
		result = prime * result + this.getLeft().getElement().hashCode();
		result = prime * result + this.getRight().getElement().hashCode();
		return result;	
	}
	
	@Override
	public boolean equals(Object pObject) {
		if(pObject == this) {
			return true;
		}
		if(pObject == null) {
			return false;
		}
		if(!(pObject instanceof Node)) {
			return false;
		}
		Node temp = (Node) pObject;
		return (this.getElement().equals(temp.getElement())) &&
				this.getLeft().getElement().equals(temp.getLeft().getElement()) &&
				this.getRight().getElement().equals(temp.getRight().getElement());
	}
	
}
