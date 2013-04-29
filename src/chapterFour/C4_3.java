/**
 * 
 */
package chapterFour;

/**
 * @author Ethan.C 
 * Given a sorted (increasing order) array, write an algorithm
 * to create a binary tree with minimal height.
 */
public class C4_3 {
	public static Node addToTree(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end + 1) / 2;
		Node n = new Node(arr[mid]);
		n.left = addToTree(arr, start, mid - 1);
		n.right = addToTree(arr, mid + 1, end);
		return n;
	}

	public static Node createMinimalBST(int arry[]) {
		return addToTree(arry, 0, arry.length - 1);
	}

}
