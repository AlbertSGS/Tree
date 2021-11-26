package tree;

public class Client {
	public static void main(String[] args) {
		Node root = new Node("+", null, null, null);
		Node one = new Node("1", null, null, null);
		Node two = new Node("2", null, null, null);
		Node three = new Node("3", null, null, null);
		Node four = new Node("4", null, null, null);
		Node mult = new Node("*", root, two, new Node("/", null, three, four));
		root.setLeft(one);
		root.setRight(mult);
		
		Tree t = new ParseTree(root);
		
		System.out.println(t.traverseTree());
	}

}
