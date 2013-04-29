/**
 * 
 */
package chapterOne;

/**
 * @author Ethan.C
 *  Design an algorithm and write code to remove the duplicate
 *  characters in a string without using any additional buffer. NOTE: One
 *  or two additional variables are fine. An extra copy of the array is
 *  not. FOLLOW UP Write the test cases for this method
 */
public class C1_3 {

	// Solution one
	public static char[] removeDuplicates(String st) {
		char[] str = st.toCharArray();
		if (str == null)
			return null;
		int len = str.length;
		if (len < 2)
			return null;
		else
			for (int i = 0; i < len; ++i) {
				int j;
				for (j = i + 1; j < len; ++j) {
					if (str[i] == str[j])
						str[j] = 0;
				}
			}
		return str;
	}

	// Solution two
	static String removeDup(String target) {
		if (target == null)
			return null;

		if (target.length() <= 1)
			return target;

		char[] str = target.toCharArray();
		boolean[] flag = new boolean[256];
		int tail = 0;
		int cur = 0;

		while (cur < str.length) {
			if (flag[str[cur]] == false) {
				flag[str[cur]] = true;
				str[tail] = str[cur];
				tail++;
				cur++;

			} else
				cur++;
		}
		return new String(str, 0, tail);
	}

}
