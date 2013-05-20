/**
 * 
 */
package chapterNine;

/**
 * @author Ethan.C You are given two sorted arrays, A and B, and A has a large
 *         enough buffer at the end to hold B. Write a method to merge B into A
 *         in sorted order.
 * 
 * 
 */
public class C9_1 {
	public static void merge(int[] a, int[] b, int n, int m) {
		int k = m + n - 1;
		int i = n - 1;
		int j = m - 1;
		while (i >= 0 && j >= 0) {
			if (a[i] > b[j])
				a[k--] = a[i--];
			else
				a[k--] = b[j--];
		}
		while (j >= 0)
			a[k--] = b[j--];
	}

}
