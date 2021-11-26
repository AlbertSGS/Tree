package tree;

public class ParseTree implements Tree {
	
	private final Node aRoot;
	
	private static final TraversalMethod IN_ORDER = new InOrderTraversal();
	
	public ParseTree(Node pRoot) {
		this.aRoot = pRoot;
	}
	
	@Override
	public Node getRoot() {
		return this.aRoot;
	}
	
	@Override
	public String traverseTree() {
		return this.aRoot.traverse(IN_ORDER);
	}

}