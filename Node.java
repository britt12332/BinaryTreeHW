
public class Node
{
	
	 int payload;
	private Node leftChild = null;
	private Node rightChild = null;
	Node(int payload)
	 {
		 this.payload = payload;
	 }
	

	 public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	
 }
