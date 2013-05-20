/**
 * 
 */
package chapterNine;

/**
 * @author Ethan.C A circus is designing a tower routine consisting of people
 *         standing atop one another’s shoulders. For practical and aesthetic
 *         reasons, each person must be both shorter and lighter than the person
 *         below him or her. Given the heights and weights of each person in the
 *         circus, write a method to compute the largest possible number of
 *         people in such a tower. Input (ht, wt): (65, 100) (70, 150) (56, 90)
 *         (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6
 *         and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110)
 *         (70,150) (75,190)
 * 
 * 
 */
public class C9_7 {
	class person {
		int h, w;
	}

	boolean cmp(person p1, person p2) {
		if (p1.h == p2.h)
			return p1.w < p2.w;
		else
			return p1.h < p2.h;
	}

	public int lis(person p[], int n) {
		int k = 1;
		int[] d = new int[n];
		d[0] = p[0].w;
		for (int i = 1; i < n; i++) {
			if (p[i].w >= d[k - 1])
				d[k++] = p[i].w;
			else {
				int j;
				for (j = k - 1; j >= 0 && d[j] > p[i].w; --j)
					;
				d[j + 1] = p[i].w;
			}
		}
		return k;
	}

}
