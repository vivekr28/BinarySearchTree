package v.l.bst;

/**
 * This class is BST and contains node class
 * 
 * @author Vivek
 *
 */

public class BinarySearchTree {

	private Node root;
	private int nodeCount;
	boolean isNodeAdded = false;

	/**
	 * Default constructor, does nothing special
	 */
	public BinarySearchTree() {

	}

	/**
	 * Inorder traversal printing
	 */
	public void print() {
		print(root);
	}
	/**
	 * Method to add a new value in tree, does not add duplicates
	 * 
	 * @param val value to be added
	 * @return true if value is added else false
	 */
	public boolean add(int val) {
		isNodeAdded = false;
		if (root == null) {

			root = new Node(val);
			nodeCount++;
			return true;
		}
		isNodeAdded = add1(root, val);
		if (isNodeAdded)
			nodeCount++;
		return isNodeAdded;
	}

	/**
	 * @return Height of tree
	 */
	public int findHeight() {

		return findHeight(root);

	}

	private int findHeight(Node node) {

		int leftHeight;
		int rightHeight;

		if (node == null)
			return -1;
		leftHeight = findHeight(node.left) + 1;
		rightHeight = findHeight(node.right) + 1;

		return leftHeight > rightHeight ? leftHeight : rightHeight;
	}

	private void print(Node node) {

		if (node == null)
			return;

		print(node.left);
		System.out.println(node.value);
		print(node.right);

	}

	private boolean add1(Node node, int value) {
		if (value < node.value) {

			if (node.left == null) {
				node.left = new Node(value);
				return true;

			} else {
				return add1(node.left, value);

			}

		} else if (value > node.value) {

			if (node.right == null) {
				node.right = new Node(value);
				return true;

			} else {
				return add1(node.right, value);

			}
		} else
			return false;

	}
	/**
	 * 
	 * @return number of nodes in the tree
	 */
	public int getNodeCount() {
		return nodeCount;
	}

	/**
	 * Node class that represents individual nodes in the BST
	 * 
	 * @author Vivek
	 *
	 */
	private class Node {
		int value;
		Node left;
		Node right;

		Node(int val) {
			this.value = val;
		}

	}
}
