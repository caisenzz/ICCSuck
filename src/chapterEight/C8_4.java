/**
 * 
 */
package chapterEight;

import java.util.ArrayList;

/**
 * @author Ethan.C Write a method to compute all permutations of a string
 * 
 */
public class C8_4 {
	public static ArrayList<String> getPerms(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		if (s == null) {
			return null;
		} else if (s.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = s.charAt(0);
		String reminder = s.substring(1);
		ArrayList<String> words = getPerms(reminder);
		for (String word : words) {
			for (int j = 0; j <= word.length(); j++) {
				permutations.add(insertCharAt(word, first, j));
			}
		}
		return permutations;
	}

	public static String insertCharAt(String word, char C, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + C + end;
	}

}
