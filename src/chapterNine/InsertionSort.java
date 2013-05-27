/**
 * 
 */
package chapterNine;

/**
 * @author Ethan.C
 * 
 */
public class InsertionSort {
	void insertSort(int[] arr) {
		int i, j, newValue;
		for (i = 1; i < arr.length; i++) {
			newValue = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > newValue) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = newValue;
		}
	}

	void insertionSortWithSwap(int[] arr) {
		int i, j, tmp;
		for (i = 1; i < arr.length; i++) {
			j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				tmp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = tmp;
				j--;
			}
		}
	}

}
