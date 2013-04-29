/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C 
 * Design an algorithm and write code to find the first common
 * ancestor of two nodes in a binary tree. Avoid storing additional
 * nodes in a data structure. NOTE: This is not necessarily a binary
 * search tree.
 */
public class C4_6 {
	private boolean covers(Node root, Node p) {
		if (root == null)
			return false;
		if (root == p)
			return true;
		else
			return covers(root.left, p) || covers(root.right, p);
	}

	public Node commonAncestor(Node root, Node p, Node q) {
		if (covers(root.left, p) && covers(root.left, q)) {
			return commonAncestor(root.left, p, q);
		}
		if (covers(root.right, p) && covers(root.right, q)) {
			return commonAncestor(root.right, p, q);
		} else
			return root;
	}

}
