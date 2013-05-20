/**
 * 
 */
package chapterEight;

/**
 * @author Ethan.C Given an infinite number of quarters (25 cents), dimes (10
 *         cents), nickels (5 cents) and pennies (1 cent), write code to
 *         calculate the number of ways of representing n cents.
 * 
 * 
 */
public class C8_7 {

	// Solution One
	int sum_n(int sum, int c, int n) {
		int ways = 0;
		if (sum <= n) {
			if (sum == n)
				return 1;
			if (c >= 25)
				ways += sum_n(sum + 25, 25, n);
			if (c >= 10)
				ways += sum_n(sum + 10, 10, n);
			if (c >= 5)
				ways += sum_n(sum + 5, 5, n);
			if (c >= 1)
				ways += sum_n(sum + 1, 1, n);
		}
		return ways;
	}

	// Solution Two
	public static int makeChange(int n, int denom) {
		int next_denom = 0;
		switch (denom) {
		case 25:
			next_denom = 10;
			break;
		case 10:
			next_denom = 5;
			break;
		case 5:
			next_denom = 1;
			break;
		case 1:
			return 1;
		}
		int ways = 0;
		for (int i = 0; i * denom <= n; i++) {
			ways += makeChange(n - 1 * denom, next_denom);
		}
		return ways;
	}

}
