/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C 
 * You are given a binary tree in which each node contains a
 * value. Design an algorithm to print all paths which sum up to that
 * value. Note that it can be any path in the tree - it does not have to
 * start at the root.
 */
public class C4_8 {
	public class PathSum {
		public boolean hasPathSum(Node root, int sum) {
			if (root == null)
				return false;
			if (root.left == null && root.right == null && root.dData == sum)
				return true;
			else
				return hasPathSum(root.left, sum - root.dData)
						|| hasPathSum(root.right, sum - root.dData);
		}
	}

}
