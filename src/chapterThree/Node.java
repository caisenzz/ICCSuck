/**
 * 
 */
package chapterThree;

/**
 * @author Ethan.C
 * This node is made for implementation of stack
 */
public class Node {
	public int value;
	public Node next;

	public Node(int value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node next() {
		return next;
	}
}
