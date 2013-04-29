package chapterOne;

/**
 * @author Ethan.C 
 * Write code to reverse a C-Style String. (C-String means that
 * “abcd” is represented as five characters, including the null character.)
 */
public class C1_2 {

	// Solution one
	static public char[] reverseOne(char[] str) {
		char[] newString = new char[128];
		int k = str.length - 1;
		for (int i = 0; i < str.length; i++) {
			newString[i] = str[k];
			k--;
		}
		return newString;
	}

	// Solution two
	static void reverseTwo(char[] target) {

		int head = 0;
		int tail = target.length - 2;
		while (head < tail) {
			char temp = target[head];
			target[head] = target[tail];
			target[tail] = temp;
			head++;
			tail--;
		}
	}

}
