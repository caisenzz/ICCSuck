/**
 * 
 */
package chapterNine;

/**
 * @author Ethan.C Given a matrix in which each row and each column is sorted,
 *         write a method to find an element in it.
 * 
 */
public class C9_6 {
	boolean FindElem(int[][] mat, int elem, int M, int N) {
		int row = 0;
		int col = N - 1;
		while (row < M && col >= 0) {
			if (mat[row][col] == elem) {
				return true;
			} else if (mat[row][col] > elem) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

}
