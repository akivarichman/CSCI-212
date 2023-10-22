import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileMenuHandler extends WordGUI implements ActionListener {
   JFrame jframe;
   public FileMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) {
         JFileChooser fd = new JFileChooser();
         fd.setFileSelectionMode(JFileChooser.FILES_ONLY);
         fd.showOpenDialog(null);
		   File f = fd.getSelectedFile();
         
         WordGUI list = new WordGUI();
         System.out.println("Illegal Words: ");
         fillWord(map, f.getAbsolutePath());
         list.initialize(map);
      }
      else if (menuName.equals("Quit")) {
         System.exit(0);
      }
   } //actionPerformed
} 