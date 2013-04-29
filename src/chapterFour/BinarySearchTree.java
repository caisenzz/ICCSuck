/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C
 * 
 */
public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if (key < current.iData)
				current = current.left;
			else
				current = current.right;
			if (current == null)
				return null;
		}
		return current;
	}

	public void insert(int id, int dd) {
		Node newNode = new Node(dd);
		newNode.iData = id;

		if (root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (id < current.iData) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null)// goto the above line

				return false;
		}
		if (current.left == null && current.right == null) {
			if (current == root)
				root = null;
			else if (isLeftChild)
				parent.left = null;
			else
				parent.right = null;
		} else if (current.right == null)
			if (current == root)
				root = current.left;
			else if (isLeftChild)
				parent.left = current.left;
			else
				parent.right = current.left;

		else if (current.left == null)
			if (current == root)
				root = current.right;
			else if (isLeftChild)
				parent.left = current.right;
			else
				parent.right = current.right;

		else {
			Node successor = getSuccessor(current);
			if (current == root)
				root = successor;
			else if (isLeftChild)
				parent.left = successor;
			else
				parent.right = successor;
			successor.left = current.left;
		}
		return true;
	}

	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.right;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.left;
		}
		if (successor != delNode.right) {
			successorParent.left = successor.right;
			successor.right = delNode.right;
		}
		return successor;
	}

	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.print("\nPreorder traversal:");
			preOrder(root);
			break;
		case 2:
			System.out.print("\nInorder traversal:");
			inOrder(root);
			break;
		case 3:
			System.out.print("\nPostorder traversal:");
			postOrder(root);
			break;
		}
		System.out.println();
	}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.iData + "");
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}

	private void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.left);
			System.out.print(localRoot.iData + "");
			inOrder(localRoot.right);
		}
	}

	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.print(localRoot.iData + "");
		}
	}

}
