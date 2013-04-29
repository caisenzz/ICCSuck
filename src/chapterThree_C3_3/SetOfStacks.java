/**
 * 
 */
package chapterThree_C3_3;

/**
 * @author Ethan.C 
 * Imagine a (literal) stack of plates. If the stack gets too
 * high, it might topple. Therefore, in real life, we would likely start
 * a new stack when the previous stack exceeds some threshold. Implement
 * a data structure SetOfStacks that mimics this. SetOfStacks should be
 * composed of several stacks, and should create a new stack once the
 * previous one exceeds capacity. SetOfStacks.push() and
 * SetOfStacks.pop() should behave identically to a single stack (that
 * is, pop() should return the same values as it would if there were
 * just a single stack). 
 * Follow Up 
 * Implement a function popAt(int index)
 * which performs a pop operation on a specific substack.
 */
public class SetOfStacks {
	int stackThreshold;
	private MyStack top;
	private MyStack base;
	private int stackCount;

	SetOfStacks(int _stackThreshold) {
		stackThreshold = _stackThreshold;
		MyStack stack = new MyStack(stackThreshold);
		top = base = stack;
		stackCount = 1;
	}

	private void pushStack() {
		MyStack stack = new MyStack(stackThreshold);
		top.previous = stack;
		stack.next = top;
		top = stack;
		stackCount++;
	}

	private boolean popStack() {
		if (top != base) {
			top.next.previous = null;
			top = top.next;
			stackCount--;
			return true;
		}
		return false;
	}

	public void push(int _value) {
		Node node = new Node(_value);
		boolean result = top.push(_value);
		if (!result) {
			this.pushStack();
			top.push(_value);
		}
	}

	public Node pop() {
		Node toReturn = top.pop();
		if (top.elementCount == 0) {
			if (!this.popStack())
				return null;
		}
		return toReturn;
	}

	public Node popAt(int stackNum) {
		if (stackNum > stackCount)
			return null;
		int numToTraceBack = stackCount - stackNum;
		MyStack toPop = top;
		for (int i = 0; i < numToTraceBack; i++) {
			toPop = toPop.next;
		}
		Node toReturn = new Node(0);
		toReturn.value = toPop.getTop().value;
		Node nodeTraverser = toPop.getTop();
		MyStack stackTraverser = toPop;
		while (stackTraverser != null) {
			if (nodeTraverser.previous == null) {
				if (stackTraverser.previous != null) {
					nodeTraverser.value = stackTraverser.previous.getBase().value;
					stackTraverser = stackTraverser.previous;
					nodeTraverser = stackTraverser.getBase();
				} else if (stackTraverser.previous == null) {
					this.pop();
					return toReturn;
				}
			} else {
				nodeTraverser.value = nodeTraverser.previous.value;
				nodeTraverser = nodeTraverser.previous;
			}
		}
		return toReturn;

	}

}
