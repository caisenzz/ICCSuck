/**
 * 
 */
package chapterFive;

/**
 * @author Ethan.C Given an integer, print the next smallest and next largest
 *         number that have the same number of 1 bits in their binary
 *         representation.
 * 
 */
public class C5_3 {
	public static boolean GetBit(int n, int index) {
		return ((n & (1 << index)) > 0);

	}

	public static int SetBit(int n, int index, boolean b) {
		if (b) {
			return n | (1 << index);
		} else {
			int mask = ~(1 << index);
			return n & mask;
		}
	}

	public static int GetNext_NP(int n) {
		if (n <= 0)
			return -1;
		int index = 0;
		int countOnes = 0;
		while (!GetBit(n, index))
			index++;
		while (GetBit(n, index)) {
			index++;
			countOnes++;
		}
		n = SetBit(n, index, true);
		index--;
		n = SetBit(n, index, false);
		countOnes--;
		for (int i = index - 1; i >= countOnes; i--) {
			n = SetBit(n, i, false);
		}
		for (int i = countOnes - 1; i >= 0; i--) {
			n = SetBit(n, i, true);
		}
		return n;
	}

	public static int GetPrevious_NP(int n) {
		if (n <= 0)
			return -1;
		int index = 0;
		int countZeros = 0;
		while (GetBit(n, index))
			index++;
		while (!GetBit(n, index)) {
			index++;
			countZeros++;
		}
		n = SetBit(n, index, false);
		index--;
		n = SetBit(n, index, true);
		countZeros--;

		for (int i = index - 1; i >= countZeros; i--) {
			n = SetBit(n, i, true);
		}
		for (int i = countZeros - 1; i >= 0; i--) {
			n = SetBit(n, i, false);
		}
		return n;
	}

}
