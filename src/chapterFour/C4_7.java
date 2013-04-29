/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C 
 * You have two very large binary trees: T1, with millions of
 * nodes, and T2, with hundreds of nodes. Create an algorithm to
 * decide if T2 is a subtree of T1.
 */
public class C4_7 {

	public boolean containsTree(Node t1, Node t2) {
		if (t2 == null)
			return true;
		else
			return subTree(t1, t2);
	}

	boolean subTree(Node r1, Node r2) {
		if (r1 == null)
			return false;
		if (r1.dData == r2.dData) {
			if (matchTree(r1, r2))
				return true;
		}
		return (subTree(r1.left, r2) || subTree(r1.right, r2));
	}

	boolean matchTree(Node r1, Node r2) {
		if (r2 == null && r1 == null)
			return true;
		if (r1 == null || r2 == null)
			return false;
		if (r1.dData != r2.dData)
			return false;
		return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));
	}

}
