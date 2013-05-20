/**
 * 
 */
package chapterNine;

/**
 * @author Ethan.C Given a sorted array of n integers that has been rotated an
 *         unknown number of times, give an O(log n) algorithm that finds an
 *         element in the array. You may assume that the array was originally
 *         sorted in increasing order.EXAMPLE:Input: find 5 in array (15 16 19
 *         20 25 1 3 4 5 7 10 14) Output: 8 (the index of 5 in the array)
 * 
 */
public class C9_3 {
	// it will fail when the data is duplicates
	public static int search(int a[], int low, int high, int x) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == x)
				return mid;
			if (a[mid] < x) {
				if (a[mid] < a[low]) {
					if (a[low] <= x)
						high = mid - 1;
					else
						low = mid + 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (a[mid] < a[low]) {
					high = mid - 1;
				} else {
					if (a[low] <= x)
						high = mid - 1;
					else
						low = mid + 1;
				}
			}
		}
		return -1;
	}

}
