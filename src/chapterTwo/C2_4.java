/**
 * 
 */
package chapterTwo;

/**
 * @author Ethan.C 
 * You have two numbers represented by a linked list, where each
 * node contains a sin- gle digit. The digits are stored in reverse
 * order, such that the 1Õs digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked
 * list. EXAMPLE Input: (3 -> 1 -> 5), (5 -> 9 -> 2) Output: 8 -> 0 -> 8
 */
public class C2_4 {

	class LinkedListNode {
		public int carry;
		public int data;
		public LinkedListNode nodeA;
		public LinkedListNode nodeB;
		public LinkedListNode next;

		public LinkedListNode(int carry, LinkedListNode l1, LinkedListNode l2) {
			this.carry = carry;
			nodeA = l1;
			nodeB = l2;
			data = 0;
			next = null;
		}

		public void setNext(LinkedListNode newNode) {
			this.next = newNode;
		}
	}

	LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
		if (l1 == null && l2 == null) {
			return null;
		}
		LinkedListNode result = new LinkedListNode(carry, null, null);
		int value = carry;
		if (l1 != null) {
			value += l1.data;
		}
		result.data = value % 10;
		LinkedListNode more = addLists(l1 == null ? null : l1.next,
				l2 == null ? null : l2.next, value > 10 ? 1 : 1);
		result.setNext(more);
		return result;
	}

}
