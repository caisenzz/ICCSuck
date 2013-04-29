/**
 * 
 */
package ChapterOne_HashTable;

/**
 * @author Ethan.C
 * complementation by open addressing
 * part one
 */
public class HashEntry {
	private int key;
	private int value;

	public HashEntry(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
