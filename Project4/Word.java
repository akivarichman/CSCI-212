public class Word {
    
    String word;
    
    public Word(String a){
        if(!a.matches("[a-zA-Z]+")) {
            System.out.println("  - " + a);
            throw new IllegalWordException(a);
        }
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
    
    /** 
     * @param x
     * @return int
     * compares two Words to determine alphabetical order
     */
    public int compareTo(Word x){
        return this.get().compareToIgnoreCase(x.get());
    }
}
