/**
 * 
 */
package chapterEight;

/**
 * @author Ethan.C Implement an algorithm to print all valid (e.g., properly
 *         opened and closed) combi- nations of n-pairs of parentheses. EXAMPLE:
 *         input: 3 (e.g., 3 pairs of parentheses) output: ()()(), ()(()),
 *         (())(), ((()))
 * 
 */
public class C8_5 {
	static void brackets(int openStock, int closeStock, String s) {
		if (openStock == 0 && closeStock == 0) {
			System.out.println(s);
		}
		if (openStock > 0) {
			brackets(openStock - 1, closeStock + 1, s + "<");
		}
		if (closeStock > 0) {
			brackets(openStock, closeStock - 1, s + ">");
		}
	}

}
