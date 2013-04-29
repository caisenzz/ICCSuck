/**
 * 
 */
package chapterThree;

/**
 * @author Ethan.C
 * one way to implement stack
 */
public class Stack {
	Node top;

	int pop() {
		if (top != null) {
			int item = top.value;
			top = top.next;
			return item;
		}
		return -1;
	}

	void push(int item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
	}

}
