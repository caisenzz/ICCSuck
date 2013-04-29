/**
 * 
 */
package ChapterOne_HashTable;

/**
 * @author Ethan.C
 * complementation by open addressing
 * part two
 */
public class DeletedEntry extends HashEntry {
	private static DeletedEntry entry = null;

	private DeletedEntry() {
		super(-1, -1);
	}

	public static DeletedEntry getUniqueDeletedEntry() {
		if (entry == null)
			entry = new DeletedEntry();
		return entry;
	}
}
