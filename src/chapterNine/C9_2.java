/**
 * 
 */
package chapterNine;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ethan.C Write a method to sort an array of strings so that all the
 *         anagrams are next to each other.
 * 
 * 
 */
public class C9_2 {
	public static String[] sortStrings(String[] arr) {
		if (arr == null || arr.length == 0 || arr.length == 1)
			return arr;

		class StringComparator implements Comparator<String> {
			private String sort(String s) {
				char[] letters = s.toCharArray();
				Arrays.sort(letters);
				return new String(letters);
			}

			public int compare(String s1, String s2) {
				return sort(s1).compareTo(sort(s2));
			}
		}
		Arrays.sort(arr, new StringComparator());
		return arr;
	}
}
