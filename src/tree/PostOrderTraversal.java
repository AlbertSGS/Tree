package tree;

public class PostOrderTraversal implements TraversalMethod {
	
	@Override
	public String traversal(Node pRoot) {
		return inOrder(pRoot, "");
	}
	
	private String inOrder(Node pRoot, String pString) {
		String result = "";
		
		if(pRoot.getLeft() != null) {
			result = result.concat(inOrder(pRoot.getLeft(), pString));
		}
		
		if(pRoot.getRight() != null) {
			result = result.concat(inOrder(pRoot.getRight(), pString));
		}

		result = result.concat(pRoot.getElement());
		
		return result;
	}
}
