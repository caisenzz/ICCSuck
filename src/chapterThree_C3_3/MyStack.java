/**
 * 
 */
package chapterThree_C3_3;

/**
 * @author Ethan.C 
 * second step
 */
public class MyStack {
	private int stackThreshold;
	private Node base;
	private Node top;

	public MyStack next;
	public MyStack previous;
	public int elementCount;

	public MyStack(int _stackThreshold) {
		stackThreshold = _stackThreshold;
		elementCount = 0;
		base = top = null;
		next = null;
		previous = null;
	}

	public boolean push(int _value) { // Node node=new Node(_value);
		if (base == null) {
			Node node = new Node(_value);
			base = top = node;
			elementCount++;
			return true;
		} else if (elementCount == stackThreshold)
			return false;
		else if (base != null) {
			Node node = new Node(_value);
			top.previous = node;
			node.next = top;
			top = node;
			elementCount++;
			return true;
		}
		return false;
	}

	public Node pop() {
		Node toReturn;
		if (top != base) {
			toReturn = top;
			top.next.previous = null;
			top = top.next;
			toReturn.next = null;
			toReturn.previous = null;
			elementCount--;
			return toReturn;
		} else if (top == base) {
			toReturn = top;
			elementCount--;
			return toReturn;
		}
		return null;

	}

	public Node getTop() {
		return this.top;
	}

	public Node getBase() {
		return this.base;
	}

}
