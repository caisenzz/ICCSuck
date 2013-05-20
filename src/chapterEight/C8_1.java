/**
 * 
 */
package chapterEight;

/**
 * @author Ethan.C Write a method to generate the nth Fibonacci number.
 * 
 */
public class C8_1 {
	// Solution One
	int fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n > 1) {
			return fibo(n - 1) + fibo(n - 2);
		} else
			return -1;
	}

	// Solution Two
	int fiboTwo(int n) {
		if (n < 0)
			return -1;
		if (n == 0)
			return 0;
		int a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

}
