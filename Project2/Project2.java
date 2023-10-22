// package Project2;

public class Project2 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        WordGUI list = new WordGUI(); // creates an object called 'list' in class WordGUI
        String file = "input.txt";
        SortedWordList words = new SortedWordList(); // creates an object called 'words' in class SortedWordList
        fillWordList(words, file); // calls a function (below) to take the words from the file and add them to the SortedWordList
        list.initialize(words);
        System.out.print(words.toString());
        System.out.print(words.length);
    }

    public static SortedWordList fillWordList(SortedWordList words, String myFile){
        TextFileInput file1 = new TextFileInput(myFile);
        String nextword = file1.readLine();
        while(nextword != null){ // places each word of the input file into the array
            Word n = new Word(nextword); // creates an object called 'n' in class Word
            words.add(n);
            nextword = file1.readLine();
        }
        return words;
    }
}