/**
 * 
 */
package chapterEight;

/**
 * @author Ethan.C Implement the “paint fill” function that one might see on
 *         many image editing pro- grams. That is, given a screen (represented
 *         by a 2-dimensional array of Colors), a point, and a new color, fill
 *         in the surrounding area until you hit a border of that color.
 * 
 * 
 */
public class C8_6 {
	enum Color {
		red, yellow, blue, green
	};

	boolean paint_fill(Color[][] screen, int m, int n, int x, int y, Color c) {
		if (x < 0 || x >= m || y < 0 || y >= n)
			return false;
		if (screen[x][y] == c)
			return false;
		else {
			screen[x][y] = c;
			paint_fill(screen, m, n, x - 1, y, c);
			paint_fill(screen, m, n, x + 1, y, c);
			paint_fill(screen, m, n, x, y - 1, c);
			paint_fill(screen, m, n, x, y + 1, c);
		}

		return true;
	}

}
