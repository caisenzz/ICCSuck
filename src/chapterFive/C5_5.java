/**
 * 
 */
package chapterFive;

/**
 * @author Ethan.C Write a function to determine the number of bits required to
 *         convert integer A to integer B.
 * 
 * 
 */
public class C5_5 {

	public static int bitSwapRequired(int a, int b) {
		int count = 0;
		for (int c = a ^ b; c != 0; c = c >> 1) {
			count += c & 1;
		}
		return count;
	}

}
