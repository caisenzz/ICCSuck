/**
 * 
 */
package ChapterOne_HashTable;

/**
 * @author Ethan.C 
 * complementation by open addressing part three 
 * Reference:
 * http://www.algolist.net/Data_structures/Hash_table/Open_addressing
 */
public class HashMap {
	private final static int TABLE_SIZE = 128;
	HashEntry[] table;

	HashMap() {
		table = new HashEntry[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++)
			table[i] = null;
	}

	public int get(int key) {
		int hash = key % TABLE_SIZE;
		while (table[hash] != null && table[hash].getKey() != key)
			hash = (hash + 1) % TABLE_SIZE;
		if (table[hash] == null)
			return -1;
		else
			return table[hash].getValue();
	}

	public void put(int key, int value) {
		int hash = key % TABLE_SIZE;
		while (table[hash].getKey() != -1 && table[hash] != null
				&& table[hash].getKey() != key)
			hash = (hash + 1) % TABLE_SIZE;
		table[hash] = new HashEntry(key, value);
	}

	public HashEntry delete(int key) {
		int hash = key % TABLE_SIZE;
		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % TABLE_SIZE;
		}
		if (table[hash].getKey() == key) {
			HashEntry temp = table[hash];
			table[hash] = DeletedEntry.getUniqueDeletedEntry();
			return temp;
		}
		return null;
	}

	/*
	 * private void resize(){ int tableSize=2*table.length; int
	 * maxSize=(int)(tableSize*threshold); HashEntry[] oldTable=table; table=new
	 * HashEntry[tableSize]; size=0; for(int i=0;i<oldTable.length;i++)
	 * if(oldTable[i]!=null) put(oldTable[i].getKey,oldTable[i].getValue()); }
	 */

}
