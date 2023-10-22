import javax.swing.*; 
import java.awt.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.*;

public class WordGUI extends JFrame {

    public static TreeMap <Word,Word> map = new TreeMap <Word,Word> (new WordComparator());

    public void createFileMenu(){
        setTitle("Project 4");
        setSize(300,300);
        setLocation  (400,200);
        menu();
    //    setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
   
    private void menu() {
      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");
      JMenu       editMenu = new JMenu("Edit");

      FileMenuHandler fmh  = new FileMenuHandler(this);
      EditMenuHandler emh  = new EditMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener(fmh);
      fileMenu.add(item);

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener(fmh);
      fileMenu.add(item);

      item = new JMenuItem("Add");       //Quit
      item.addActionListener(emh);
      editMenu.add(item);

      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      setJMenuBar(menuBar);
   }

    /** 
     * @param words TreeMap with words from the input file sorted in alphabetical order
     */
    public void initialize(TreeMap <Word, Word> words){ // creates a JFrame and text areas for each catergory of words
        JFrame myFrame = new JFrame();
        myFrame.setSize(200,100);
        myFrame.setLocation(100,100);
        myFrame.setTitle("Project 4");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = myFrame.getContentPane();
        myFrame.setLayout(new GridLayout(2,3));
        TextArea aTextArea = new TextArea(10,20);
        TextArea eTextArea = new TextArea(10,20);
        TextArea iTextArea = new TextArea(10,20);
        TextArea oTextArea = new TextArea(10,20);
        TextArea uTextArea = new TextArea(10,20);
        TextArea myTextArea = new TextArea(10,20);
        myContentPane.add(aTextArea);
        myContentPane.add(eTextArea);
        myContentPane.add(iTextArea);
        myContentPane.add(oTextArea);
        myContentPane.add(uTextArea);
        myContentPane.add(myTextArea);


        for(Map.Entry<Word,Word> word : words.entrySet()) {
            if(word.getKey().get().charAt(0) == 'a' || word.getKey().get().charAt(0) == 'A'){
                aTextArea.append(word.getKey().get() + '\n');
            }
            else if(word.getKey().get().charAt(0) == 'e' || word.getKey().get().charAt(0) == 'E'){
                eTextArea.append(word.getKey().get() + '\n');
            }
            else if(word.getKey().get().charAt(0) == 'i' || word.getKey().get().charAt(0) == 'I'){
                iTextArea.append(word.getKey().get() + '\n');
            }
            else if(word.getKey().get().charAt(0) == 'o' || word.getKey().get().charAt(0) == 'O'){
                oTextArea.append(word.getKey().get() + '\n');
            }
            else if(word.getKey().get().charAt(0) == 'u' || word.getKey().get().charAt(0) == 'U'){
                uTextArea.append(word.getKey().get() + '\n');
            }
            else {
                myTextArea.append(word.getKey().get() + '\n');
            }
        }

        aTextArea.setEditable(false); // ensures that the TextAreas cannot be edited
        eTextArea.setEditable(false);
        iTextArea.setEditable(false);
        oTextArea.setEditable(false);
        uTextArea.setEditable(false);
        myTextArea.setEditable(false);
        myFrame.setVisible(true); // makes the JFrame visible 
        myFrame.pack(); // makes the JFrame and its contents fit in the window 
    }

    /** 
    * @param words
    * @param myFile
    * @return TreeMap<Word, Word>
    * Takes in each word in the input.txt file, creates a Word object, and adds it to the TreeMap
    */
    public static void fillWord(TreeMap <Word,Word> words, String myFile){
        TextFileInput file1 = new TextFileInput(myFile);
        String nextword = file1.readLine();
        StringTokenizer myTokens = new StringTokenizer(nextword," ,.");
        String[] tokens = new String[myTokens.countTokens()];
        int count = 0;
        while(nextword != null){
            try { // add words to map
                if(count == 0) {
                    int i = 0;
                    while (myTokens.hasMoreTokens()) {
                        tokens[i]=myTokens.nextToken();
                        i++;
                    }
                }
                while(count < tokens.length) {
                    Word n = new Word(tokens[count]);
                    words.put(n,null);
                    count++;
                }
            }
            catch(IllegalWordException e){

            }
            finally {
                if (count < tokens.length - 1) {
                    count++;
                }
                else {
                    nextword = file1.readLine();
                    if(nextword != null) {
                        myTokens = new StringTokenizer(nextword," ,.");
                        tokens = new String[myTokens.countTokens()];
                        count = 0;
                    }
                }
            }
        }
    }

    
    /** 
     * @param words
     * @param n
     * adds the new word inputed by the user into the TreeMap
     */
    public static void addWord(TreeMap <Word,Word> words, Word n) {
        words.put(n,null);
    }
}