/**
 * 
 */
package chapterTwo;

import java.util.HashSet;

/**
 * @author Ethan.C 
 * Given a circular linked list, implement an algorithm which
 * returns node at the beginning of the loop. DEFINITION Circular linked
 * list: A (corrupt) linked list in which a nodeÕs next pointer points
 * to an earlier node, so as to make a loop in the linked list. EXAMPLE
 * Input: A -> B -> C -> D -> E -> C [the same C as earlier] Output: C
 * 
 */
public class C2_5 {

	// Solution one
	// time complexity O(n),space complexity O(n)

	public static boolean hasLoop(LinkedListNode startNode) {
		HashSet nodesSeen = new HashSet();
		LinkedListNode currentNode = startNode;
		do {
			if (nodesSeen.contains(currentNode))
				return true;
			nodesSeen.add(currentNode);
		} while (currentNode == currentNode.next);
		return false;
	}

	// Solution two
	LinkedListNode FindBeginning(LinkedListNode head) {
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		while (n2.next != null) {
			n1 = n1.next;
			n2 = n2.next.next;
			if (n1 == n2) {
				break;
			}
		}
		if (n2.next == null) {
			return null;
		}

		n1 = head;
		while (n1 != n2) {
			n1 = n1.next;
			n2 = n2.next;
		}
		return n2;
	}

}
