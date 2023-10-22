import javax.swing.*; 
import java.awt.*;

public class WordGUI extends JFrame {
    
    /** 
     * @param words sorted list with the words from the input file
     */
    public void initialize(SortedWordList words){ // creates a JFrame and text areas for each catergory of words
        JFrame myFrame = new JFrame();
        myFrame.setSize(200,100);
        myFrame.setLocation(100,100);
        myFrame.setTitle("Project 2");
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


        for(int j = 0; j < words.getLength(); j++){
            if(words.get(j).charAt(0) == 'a' || words.get(j).charAt(0) == 'A'){
                aTextArea.append(words.get(j) + '\n');
            }
            else if(words.get(j).charAt(0) == 'e' || words.get(j).charAt(0) == 'E'){
                eTextArea.append(words.get(j) + '\n');
            }
            else if(words.get(j).charAt(0) == 'i' || words.get(j).charAt(0) == 'I'){
                iTextArea.append(words.get(j) + '\n');
            }
            else if(words.get(j).charAt(0) == 'o' || words.get(j).charAt(0) == 'O'){
                oTextArea.append(words.get(j) + '\n');
            }
            else if(words.get(j).charAt(0) == 'u' || words.get(j).charAt(0) == 'U'){
                uTextArea.append(words.get(j) + '\n');
            }
            else {
                myTextArea.append(words.get(j) + '\n');
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