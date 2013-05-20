/**
 * 
 */
package chapterEight;

/**
 * @author Ethan.C Write an algorithm to print all ways of arranging eight
 *         queens on a chess board so that none of them share the same row,
 *         column or diagonal.
 * 
 */
public class C8_8 {
	static int columnForRow[] = new int[8];

	static boolean check(int row) {
		for (int i = 0; i < row; i++) {
			int diff = Math.abs(columnForRow[i] - columnForRow[row]);
			if (diff == 0 || diff == row - i)
				return false;
		}
		return true;
	}

	static void placeQueen(int row) {
		if (row == 8) {
			printBoard();
			return;
		}
		for (int i = 0; i < 8; i++) {
			columnForRow[row] = i;
			if (check(row)) {
				placeQueen(row + 1);
			}
		}
	}

	static void printBoard() {
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				if (j == columnForRow[i])
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String arg[]) {
		placeQueen(0);

	}

}
