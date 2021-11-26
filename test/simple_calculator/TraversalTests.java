package simple_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tree.InOrderTraversal;
import tree.Node;
import tree.PostOrderTraversal;
import tree.PreOrderTraversal;
import tree.TraversalMethod;

class TraversalTests {
	
	private Node aRoot;
	private static final TraversalMethod IN_ORDER = new InOrderTraversal();
	private static final TraversalMethod PRE_ORDER = new PreOrderTraversal();
	private static final TraversalMethod POST_ORDER = new PostOrderTraversal();
	
	void buildTree() {
		this.aRoot = new Node("+", null,
				new Node("*", null,
						new Node("3", null, null, null),
						new Node("4", null, null, null)),
				new Node("2", null, null, null));
	}

	@Test
	void in_Order_Test() {
		this.buildTree();
		String result = this.aRoot.traverse(IN_ORDER);
		System.out.println(result);
		assertTrue(result.equals("((3*4)+2)"));
	}

	@Test
	void pre_Order_Test() {
		this.buildTree();
		String result = this.aRoot.traverse(PRE_ORDER);
		System.out.println(result);
		assertTrue(result.equals("+*342"));
	}
	
	@Test
	void post_Order_Test() {
		this.buildTree();
		String result = this.aRoot.traverse(POST_ORDER);
		System.out.println(result);
		assertTrue(result.equals("34*2+"));
	}

}
