package chapterThree;

import java.util.Stack;

/**
 * @author Ethan.C 
 * How would you design a stack which, in addition to push and
 * pop, also has a function min which returns the minimum element? Push,
 * pop and min should all operate in O(1) time.
 */
public class C3_2_oneSolution {

	public static class StackWithMin2 extends Stack<Integer> {
		Stack s2;

		public StackWithMin2() {
			s2 = new Stack<Integer>();
		}

		public void push(int value) {
			if (value <= min()) {
				s2.push(value);
			}
			super.push(value);
		}

		public Integer pop() {
			int value = super.pop();
			if (value == min()) {
				s2.pop();
			}
			return value;
		}

		public int min() {
			if (s2.isEmpty()) {
				return Integer.MAX_VALUE;
			} else {
				return (Integer) s2.peek();
			}
		}
	}

}
