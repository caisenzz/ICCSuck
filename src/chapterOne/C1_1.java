/**
 * 
 */
package chapterOne;

/**
 * @author Ethan.C 
 * Problem One
 *  Implement an algorithm to determine if a string
 *  has all unique characters. What if you can not use additional data structures?
 */
public class C1_1 {

	// Solution one
	// time complexity is O(n),space complexity is O(n)

	static boolean hasDuplicate(String resource) {
		char[] str = resource.toCharArray();
		boolean[] mark = new boolean[256]; // default value: false

		for (int i = 0; i < str.length; i++) {
			if (mark[str[i]] == true)
				return false;
			else
				mark[str[i]] = true;
		}

		return true;
	}

	// Solution two
	// time complexity is O(n^2)

	static public boolean isUniqueChar1(String str) {
		int i, k;
		char value;
		for (i = 0; i < str.length(); i++) {
			value = str.charAt(i);
			for (k = i + 1; k < str.length(); k++) {
				if (value == str.charAt(k))
					return false;
			}
		}
		return true;
	}

}
