
package chapterTwo;

import java.util.Hashtable;

/**
 * @author Ethan.C
 *  Write code to remove duplicates from an unsorted linked list.
 *  FOLLOW UP How would you solve this problem if a temporary buffer is
 *  not allowed?
 */
public class C2_1 {

	// Solution one
	// time O(n), memory O(n)
	public static void deleteDups(LinkedListNode n) {
		Hashtable table = new Hashtable();
		LinkedListNode previous = null;
		while (n != null) {
			if (table.containsKey(n.data))
				previous.next = n.next;
			else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}

	// Solution two
	// time O(n^2) memory O(1)

	public void removeDuplicates(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			LinkedListNode prev = current;
			LinkedListNode next = current.next;
			while (next != null) {
				if (current.equals(next)) {
					prev.next = next.next;
				} else {
					prev = next;
				}
				next = next.next;
			}
			current = current.next;
		}
	}

}
