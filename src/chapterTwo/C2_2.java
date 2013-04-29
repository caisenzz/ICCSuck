/**
 * 
 */
package chapterTwo;

/**
 * @author Ethan.C 
 * Implement an algorithm to find the nth to last element of a
 * singly linked list.
 */
public class C2_2 {

	// Solution one
	public static LinkedListNode findNode(LinkedListNode head, int n) {

		LinkedListNode current;
		current = head;
		int nodeNum = 0;
		while (current != null) {
			current = current.next;
			nodeNum++;
		}
		int toHeadNum = nodeNum - n;
		if (toHeadNum < 0)
			return null;
		else
			current = head;
		while (toHeadNum != 0) {
			current = current.next;
			toHeadNum--;
		}
		return current;
	}

	// Solution two
	LinkedListNode nthToLast(LinkedListNode head, int n) {
		if (head == null || n < 1) {
			return null;
		}
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for (int j = 0; j < n - 1; ++j) {
			if (p2 == null) {
				return null;
			} else
				p2 = p2.next;
		}
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

}
