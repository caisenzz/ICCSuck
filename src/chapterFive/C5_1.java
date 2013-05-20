/**
 * 
 */
package chapterFive;

/**
 * @author Ethan.C You are given two 32-bit numbers, N and M, and two bit
 *         positions, i and j. Write a method to set all bits between i and j in
 *         N equal to M (e.g., M becomes a substring of N located at i and
 *         starting at j).
 * 
 */
public class C5_1 {
	public static int updateBits(int n, int m, int i, int j) {
		int max = 0;
		int left = max - ((j + 1)) - 1;
		int right = ((1 << i) - 1);
		int mask = left | right;
		return (n & mask) | (m << i);
	}

}
