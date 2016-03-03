
public class BinaryTree
{
	Node root;
		
	public BinaryTree(int root) 
	{
		Node rootNode = new Node(root);
		this.root = rootNode;
	}
	public void addValue (int payload)
	{
		Node newNode = new Node(payload);
		//System.out.println(root.payload);
		//System.out.println("newNodedata" +newNode.payload);
		
		
		if(root.payload >= newNode.payload)
		{
			newNode.setLeftChild(newNode);
			System.out.println("We placed " +newNode.payload + " left of the root " + root.payload);
		}
		if(root.payload < newNode.payload)
		{
			newNode.setRightChild(newNode);
			System.out.println("We placed "+ newNode.payload+ " right of the root " + root.payload);
		}
		
	}
	
}
