// WordList.java

// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.

public class WordList {
    
	/** First node in linked list - dummy node */
	WordNode first = new WordNode(null);

	/** Last node in linked list */
	WordNode last = first;

	/** Number of data items in the list. */
	int length = 0;

	/**
	 * Appends a String data element to this WordList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	public void append(Word d) {
		WordNode n = new WordNode(d);
        last.next = n;
        last = n;
        length++;
	} // method append(Word)

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	
	/** 
	 * @param j returns the word in the jth spot of the WordList as a string
	 * @return String
	 */
	public String get(int j){
		WordNode n = first.next;
		for(int i = 0; i < j; i++){
			n = n.next;
		}
		Word x = n.data;
		return x.get();
	}

	
	/** 
	 * converts the WordList to a string
	 * @return String
	 */
	public String toString() {
		WordNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}



} // class LinkedList