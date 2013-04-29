/**
 * 
 */
package chapterFour;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Ethan.C 
 * Given a binary search tree, design an algorithm which creates
 * a linked list of all the nodes at each depth (eg, if you have a tree
 * with depth D, you’ll have D linked lists).
 */
public class C4_4 {
	ArrayList<LinkedList<Node>> findLevelLinkList(Node root) {
		int level = 0;
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> list = new LinkedList<Node>();
		list.add(root);
		result.add(level, list);
		while (true) {
			list = new LinkedList<Node>();
			for (int i = 0; i < result.get(level).size(); i++) {
				Node n = (Node) result.get(level).get(i);
				if (n != null) {
					if (n.left != null)
						list.add(n.left);
					if (n.right != null)
						list.add(n.right);
				}
			}
			if (list.size() > 0) {
				result.add(level + 1, list);
			} else {
				break;
			}
			level++;
		}
		return result;
	}

}
