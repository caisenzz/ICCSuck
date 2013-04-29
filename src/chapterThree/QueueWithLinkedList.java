/**
 * 
 */
package chapterThree;

import java.util.LinkedList;

/**
 * @author Ethan.C 
 * implementation with Linkedlist
 */
public class QueueWithLinkedList {
	private LinkedList list = new LinkedList();

	public void enqueue(int item) {
		list.addLast(item);
	}

	public Object dequeue() {
		return list.poll();
	}

	public boolean hasItems() {
		return !list.isEmpty();
	}

	public int size() {
		return list.size();
	}

}
