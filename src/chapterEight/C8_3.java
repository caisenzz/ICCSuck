/**
 * 
 */
package chapterEight;

import java.util.ArrayList;

/**
 * @author Ethan.C Write a method that returns all subsets of a set.
 * 
 */
public class C8_3 {
	// Solution One
	ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> allSubSets;
		if (set.size() == index) {
			allSubSets = new ArrayList<ArrayList<Integer>>();
			allSubSets.add(new ArrayList<Integer>());
		} else {
			allSubSets = getSubSets(set, index + 1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subSet : allSubSets) {
				ArrayList<Integer> newSubSet = new ArrayList<Integer>();
				newSubSet.addAll(subSet);
				newSubSet.add(item);
				moreSubSets.add(newSubSet);
			}
			allSubSets.addAll(moreSubSets);
		}
		return allSubSets;

	}

	// Solution Two
	ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size();
		for (int i = 0; i < max; i++) {
			ArrayList<Integer> subSet = new ArrayList<Integer>();
			int k = i;
			int index = 0;
			while (k > 0) {
				if ((k & 1) > 0) {
					subSet.add(set.get(index));
				}
				k >>= 1;
				index++;
			}
			allSubSets.add(subSet);
		}
		return allSubSets;
	}

}
