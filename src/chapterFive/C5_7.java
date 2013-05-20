/**
 * 
 */
package chapterFive;

import java.util.ArrayList;

/**
 * @author Ethan.C An array A[1...n] contains all the integers from 0 to n
 *         except for one number which is missing. In this problem, we cannot
 *         access an entire integer in A with a single operation. The elements
 *         of A are represented in binary, and the only operation we can use to
 *         access them is Òfetch the jth bit of A[i]Ó, which takes constant
 *         time. Write code to find the missing integer. Can you do it in O(n)
 *         time?
 * 
 * 
 */
public class C5_7 {
	// Solution One(this solution only works for 2^n)
/*
	int findMissing(ArrayList<BitInteger> array) {
		return findMissing(array, BitInteger.INTEGER_SIZE - 1);
	}

	int findMissing(ArrayList<BitInteger> input, int column) {
		if (column < 0) {
			return 0;
		}
		ArrayList<BitInteger> oddIndices = new ArrayList<BitInteger>();
		ArrayList<BitInteger> evenIndices = new ArrayList<BitInteger>();
		for (BitInteger t : input) {
			if (t.fetch(column) == 0) {
				evenIndices.add(t);
			} else {
				oddIndices.add(t);
			}
		}
		if (oddIndices.size() >= evenIndices.size()) {
			return (findMissing(evenIndices, column - 1)) << 1 | 0;
		} else {
			return (findMissing(oddIndices, column - 1)) << 1 | 1;
		}
	}

	// Solution Two
	public static int get(int a[], int i) {
		int ret = 0;
		for (int j = 31; j >= 0; --j)
			ret = (ret << 1 | fetch(a, i, j));
		return ret;
	}

	public static int missing(int a[], int n) {
		boolean[] checkArray = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			checkArray[get(a, i)] = true;
		for (j = 0; j < n + 1; ++j) {
			if (!checkArray[j])
				return j;
		}
	}
	*/

}
