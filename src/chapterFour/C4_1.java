/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C 
 * Implement a function to check if a tree is balanced. For the
 * purposes of this question, a balanced tree is defined to be a tree
 * such that no two leaf nodes differ in distance from the root by more
 * than one.
 */
public class C4_1 {
	public static int minDepth(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	public static int maxDepth(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	public static boolean isBalanced(Node root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}

}
