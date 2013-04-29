/**
 * 
 */
package chapterThree;

/**
 * @author Ethan.C 
 * Solution two
 */
public class C3_1_twoSolution {

	public class StackNode {
		public int value;
		public int previous;

		public StackNode(int _value, int previous) {
			value = _value;
			this.previous = previous;
		}

		int stackSize = 300;
		int indexUsed = 0;
		int[] stackPointer = { -1, -1, -1 };
		StackNode[] buffer = new StackNode[stackSize * 3];

		void push(int stackNum, int value) {
			int lastIndex = stackPointer[stackNum];
			int currentIndex = lastIndex;
			while (currentIndex < indexUsed) {
				currentIndex++;
				if (buffer[currentIndex] == null) {
					break;
				}
			}
			stackPointer[stackNum] = currentIndex;
			if (currentIndex == indexUsed) {
				indexUsed++;
			}
			buffer[stackPointer[stackNum]] = new StackNode(value, lastIndex);
		}

		int pop(int stackNum) {
			int value = buffer[stackPointer[stackNum]].value;
			int lastIndex = stackPointer[stackNum];
			stackPointer[stackNum] = buffer[stackPointer[stackNum]].previous;
			buffer[lastIndex] = null;
			if (lastIndex == indexUsed - 1) {
				indexUsed--;
			}
			return value;
		}

		int peek(int stack) {
			return buffer[stackPointer[stack]].value;
		}

		boolean isEmpty(int stackNum) {
			return stackPointer[stackNum] == -1;
		}

	}
}
