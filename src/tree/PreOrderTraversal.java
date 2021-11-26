package tree;

public class PreOrderTraversal implements TraversalMethod {
	
	@Override
	public String traversal(Node pNode) {
		return preOrder(pNode, "");
	}

	private String preOrder(Node pRoot, String pString) {
		String result = "";

		result = result.concat(pRoot.getElement());
		
		if(pRoot.getLeft() != null) {
			result = result.concat(preOrder(pRoot.getLeft(), pString));
		}
		
		if(pRoot.getRight() != null) {
			result = result.concat(preOrder(pRoot.getRight(), pString));
		}
		
		return result;
	}
}
