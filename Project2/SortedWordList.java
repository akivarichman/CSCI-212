public class SortedWordList extends WordList {

    public SortedWordList(){

    }

    /** 
     * adds a new word to the WordList, placing it in the correct spot to remain in alphabetical order
     * @param x the Word to be added
     */
    public void add(Word x){
        this.length++;
        WordNode p = this.first;
        WordNode word = new WordNode(x);
        while(p.next != null && (word.data.compareTo(p.next.data))) {
            p = p.next;
        }
        word.next = p.next;
        p.next = word;
    }
}