/**
 * 
 */
package chapterOne;

/**
 * @author Ethan.C 
 * Given an image represented by an NxN matrix, where each pixel
 * in the image is 4 bytes, write a method to rotate the image by 90
 * degrees. Can you do this in place?
 */
public class C1_6 {

	// Solution one
	static public int[][] rotateMartrixRightOne(int[][] matrix) {
		int w = matrix.length;
		int h = matrix[0].length;
		int[][] ret = new int[h][w];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; i < w; ++j) {
				ret[i][j] = matrix[w - j - 1][i];
			}
		}
		return ret;
	}

	// solution two
	static public void rotateMartrixRightTwo(int[][] a, int n) {
		int tmp;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				tmp = a[i][j];
				a[i][j] = a[j][n - i - 1];
				a[j][n - i - 1] = a[n - i - 1][n - j - 1];
				a[n - i - 1][n - j - 1] = a[n - j - 1][i];
				a[n - j - 1][i] = tmp;
			}
		}

	}

}
