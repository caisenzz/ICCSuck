/**
 * 
 */
package chapterEight;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Set;

/**
 * @author Ethan.C Imagine a robot sitting on the upper left hand corner of an
 *         NxN grid. The robot can only move in two directions: right and down.
 *         How many possible paths are there for the robot? FOLLOW UP Imagine
 *         certain squares are “off limits”, such that the robot can not step on
 *         them. Design an algorithm to get all possible paths for the robot.
 * 
 * 
 */
public class C8_2 {
	public static int allPossiblePaths(int m, int n) {
		if (n == 0 || m == 0) {
			return 1;
		} else
			return allPossiblePaths(m - 1, n) + allPossiblePaths(m, n - 1);
	}

	public static int allPossiblePathWithObstacles(int m, int n,
			ArrayList<Point> obstacles) {
		if (obstacles.contains(new Point(m, n)))
			return 0;
		else {
			if (n == 0 || m == 0)
				return 1;
			else
				return allPossiblePathWithObstacles(m - 1, n, obstacles)
						+ allPossiblePathWithObstacles(m, n - 1, obstacles);
		}
	}

	public static void PrintAllPossibleWithObstacles(int m, int n,
			Set<Point> obstacles, String path) {
		if (obstacles.contains(new Point(m, n)))
			return;
		else {
			if (m == 0) {
				for (int i = 0; i < n; ++i)
					path = "DOWN" + path;
				System.out.println(path);
			} else if (n == 0) {
				for (int i = 0; i < m; ++i)
					path = "RIGHT" + path;
				System.out.println(path);
			} else {
				PrintAllPossibleWithObstacles(m - 1, n, obstacles, "RIGHT"
						+ path);
				PrintAllPossibleWithObstacles(m, n - 1, obstacles, "DOWN"
						+ path);
			}
		}
	}

}
