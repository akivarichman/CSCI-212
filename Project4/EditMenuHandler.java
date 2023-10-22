import javax.swing.*;
import java.awt.event.*;
public class EditMenuHandler extends WordGUI implements ActionListener {
   JFrame jframe;
   public EditMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String newWord;
      String menuName = event.getActionCommand();
        if (menuName.equals("Add")) {
         newWord = JOptionPane.showInputDialog(null,"Enter another word:");
            try {
            Word n = new Word(newWord);
            WordGUI list = new WordGUI();
            addWord(map, n);
            list.initialize(map);
            }
            catch(IllegalWordException e){

            }
        }
   } //actionPerformed
}
