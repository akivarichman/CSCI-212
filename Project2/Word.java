public class Word {
    
    String word;
    
    public Word(String a){
        word = a;
    }

    
    /** 
     * @param x
     */
    public void set(String x){
        word = x;
    }

    
    /** 
     * @return String
     */
    public String get(){
        return word;
    }

    public void equals(){

    }
    
    /** 
     * @param x compares to see if the input parameter Word comes before or after the Word
     * @return boolean
     * returns true if it should come after
     */
    public boolean compareTo(Word x){
        if(this.get().compareToIgnoreCase(x.get()) > 0){
            return true;
        }
        return false;
    }
    
    /** 
     * @return String
     */
    public String toString(){
        return this.get();
    }

}
