/**
 * 
 */
package chapterNine;

/**
 * @author Ethan.C
 * 
 */
public class SelectionSort {
	public void selectionSort(int[] arr) {
		int i, j, tmp, minIndex;
		int n = arr.length;
		for (i = 0; i < n; n++) {
			minIndex = i;
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			if (minIndex != i) {
				tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}

}
