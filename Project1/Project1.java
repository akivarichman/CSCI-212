// package Project1;

public class Project1 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        WordGUI list = new WordGUI(); // creates an object called 'list' in class WordGUI
        String file = "input.txt";
        String[] words = new String[50];
        fillArray(words, file);
        list.initialize(words);
    }
    
    
    /** 
     * @param words array to hold the words found in the input file
     * @param myFile references the input file
     * @return String[]
     */
    public static String[] fillArray(String[] words, String myFile){
        TextFileInput file1 = new TextFileInput(myFile);
        int x = 0;
        String nextword = file1.readLine();
        while(nextword != null){ // places each word of the input file into the array
            words[x] = nextword;
            nextword = file1.readLine();
            x = x + 1;
        }
        return words;
    }

}
