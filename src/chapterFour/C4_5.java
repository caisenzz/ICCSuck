/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C 
 * Write an algorithm to find the ‘next’ node (e.g., in-order
 * successor) of a given node in a binary search tree where each node
 * has a link to its parent.
 */
public class C4_5 {
	public static Node inorderSucc(Node e) {
		if (e != null) {
			Node p;
			if (e.parent == null || e.right != null) {
				p = leftMostChild(e.right);
			} else {
				while ((p = e.parent) != null) {
					if (p.left == e) {
						break;
					}
					e = p;
				}
			}
			return p;
		}
		return null;
	}

	public static Node leftMostChild(Node e) {
		if (e == null)
			return null;
		while (e.left != null)
			e = e.left;
		return e;
	}

}
