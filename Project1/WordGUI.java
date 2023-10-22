import javax.swing.*; 
import java.awt.*;

public class WordGUI extends JFrame {
    
    /** 
     * @param words array with the words from the input file
     */
    public void initialize(String[] words){ // creates a JFrame and text areas for each catergory of words
        JFrame myFrame = new JFrame();
        myFrame.setSize(200,100);
        myFrame.setLocation(100,100);
        myFrame.setTitle("Project 1");
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

        int x = 0;
        while(words[x] != null){ // places each word in the array into the correct TextArea
            if(words[x].charAt(0) == 'a' || words[x].charAt(0) == 'A'){
                aTextArea.append(words[x] + '\n');
            }
            else if(words[x].charAt(0) == 'e' || words[x].charAt(0) == 'E'){
                eTextArea.append(words[x] + '\n');
            }
            else if(words[x].charAt(0) == 'i' || words[x].charAt(0) == 'I'){
                iTextArea.append(words[x] + '\n');
            }
            else if(words[x].charAt(0) == 'o' || words[x].charAt(0) == 'O'){
                oTextArea.append(words[x] + '\n');
            }
            else if(words[x].charAt(0) == 'u' || words[x].charAt(0) == 'U'){
                uTextArea.append(words[x] + '\n');
            }
            else {
                myTextArea.append(words[x] + '\n');
            }
            x++;
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