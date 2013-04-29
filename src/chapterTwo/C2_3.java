/**
 * 
 */
package chapterTwo;

/**
 * @author Ethan.C 
 * Implement an algorithm to delete a node in the middle of a
 * single linked list, given only access to that node. EXAMPLE Input:
 * the node ÔcÕ from the linked list a->b->c->d->e Result: nothing is
 * returned, but the new linked list looks like a->b->d->e
 */

public class C2_3 {
	public static boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false;
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}

}
