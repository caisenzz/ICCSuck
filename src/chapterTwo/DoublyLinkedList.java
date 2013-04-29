/**
 * 
 */
package chapterTwo;

/**
 * @author Ethan.C
 * implementation of single linkedlist
 * http://www.algolist.net/Data_structures/Singly-linked_list/Insertion
 * 
 */
public class DoublyLinkedList {

	static class Link {
		public long dDate;
		public Link next;
		public Link previous;

		public Link(long d) {
			dDate = d;
		}

		public void displayLink() {
			System.out.print(dDate + " ");
		}
	}

	private Link first;
	private Link last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long dd) {
		Link newLink = new Link(dd);
		if (isEmpty())
			last = newLink;
		else
			first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(long dd) {
		Link newLink = new Link(dd);
		if (isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		if (first.next == null)
			last = null;
		else
			first = first.next;
		first.next.previous = null;
		return temp;
	}

	public Link deleteLast() {
		Link temp = last;
		if (last.previous == null)
			first = null;
		else
			last.next = null;
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(long key, long dd) {
		Link current = first;
		while (current.dDate != key) {
			current = current.next;
			if (current == null)
				return false;
		}
		Link newLink = new Link(dd);
		if (current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}

	public Link deletekey(long key) {
		Link current = first;
		while (current.dDate != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
			if (current == first) {
				first = current.next;
				current.next.previous = null;
			} else {
				current.previous.next = current.next;
				current.next.previous = current.previous;
			}
		}
		return current;
	}

}
