package tree;

public class InOrderTraversal implements TraversalMethod {
	
	@Override
	public String traversal(Node pRoot) {
		return inOrder(pRoot, "");
	}
	
	private String inOrder(Node pRoot, String pString) {
		String result = "";
		
		if(pRoot.getLeft() != null) {
			result = result.concat("(" + inOrder(pRoot.getLeft(), pString));
		}
		
		result = result.concat(pRoot.getElement());
		
		if(pRoot.getRight() != null) {
			result = result.concat(inOrder(pRoot.getRight(), pString) + ")");
		}
		
		return result;
	}
}
