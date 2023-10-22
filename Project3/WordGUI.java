import javax.swing.*; 
import java.awt.*;
import java.util.TreeMap;
import java.util.Map;

public class WordGUI extends JFrame {

    public void createFileMenu(){
        setTitle("Project 3");
        setSize(300,300);
        setLocation  (400,200);
        fileMenu();
    //    setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
   
    private void fileMenu() {
      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");

      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener(fmh);
      fileMenu.add(item);

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener(fmh);
      fileMenu.add(item);

      menuBar.add(fileMenu);
      setJMenuBar(menuBar);
   }

    /** 
     * @param words TreeMap with words from the input file sorted in alphabetical order
     */
    public void initialize(TreeMap <Word, Word> words){ // creates a JFrame and text areas for each catergory of words
        JFrame myFrame = new JFrame();
        myFrame.setSize(200,100);
        myFrame.setLocation(100,100);
        myFrame.setTitle("Project 3");
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
}