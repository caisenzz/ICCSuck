/**
 * 
 */
package chapterOne;

import java.util.Arrays;

/**
 * @author Ethan.C
 * Write a method to decide if two strings are anagrams or not.
 * 
 */
public class C1_4 {

	// Solution one
	static void sort(String str) {
		char[] word = str.toCharArray();
		for (int i = 0; i < word.length - 1; i++) {
			for (int j = i + 1; j < word.length - 1; j++)
				if (word[i] > word[j]) {
					char temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
		}
		String wordSt = String.valueOf(word);
		System.out.println(wordSt);

	}

	public static void anagramOne(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		String sortedS = new String(sChar);
		String sortedT = new String(tChar);
		if (Arrays.equals(sChar, tChar)) {
			System.out.println("success");
		} else
			System.out.println("failed");
	}

	// Solution two
	public static boolean anagramTwo(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			if (letters[c] == 0)
				++num_unique_chars;
			++letters[c];
		}
		for (int i = 0; i < t.length(); ++i) {
			int c = (int) t.charAt(i);
			if (letters[c] == 0) {
				return false;
			}
			--letters[c];
			if (letters[c] == 0) {
				++num_completed_t;
				if (num_completed_t == num_unique_chars) {
					return i == t.length() - 1;
				}
			}
		}
		return false;
	}

}
