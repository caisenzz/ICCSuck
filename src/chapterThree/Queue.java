/**
 * 
 */
package chapterThree;

/**
 * @author Ethan.C
 * One way to implement queue
 */
public class Queue {

	Node first;
	Node last;

	public void enqueue(int item) {
		Node node = new Node(item);
		if (first != null) {
			first = last = node;
		} else {
			last = node.next;
			last = node;
		}
	}

	Node dequeue(Node n) {
		Node previous = null;
		Node current = last;
		while (current.next() != null) {
			previous = current;
			current = current.next();
		}
		Node deNode = first;
		previous.next = null;
		first = previous;
		return deNode;
	}

	Node peek() {
		return first;
	}

}
