import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.TreeMap;

public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   public FileMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) { // maybe have it return a String?
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) {
         JFileChooser fd = new JFileChooser();
         fd.setFileSelectionMode(JFileChooser.FILES_ONLY);
         fd.showOpenDialog(null);
		   File f = fd.getSelectedFile();
         
         WordGUI list = new WordGUI();
         TreeMap <Word,Word> map = new TreeMap <Word,Word> (new WordComparator());
         System.out.println("Illegal Words: ");
         fillWord(map, f.getAbsolutePath());
         list.initialize(map);
      }
      else if (menuName.equals("Quit")) {
         System.exit(0);
      }

   } //actionPerformed
   
   /** 
    * @param words
    * @param myFile
    * @return TreeMap<Word, Word>
    * Takes in each word in the input.txt file, creates a Word object, and adds it to the TreeMap
    */
   public static TreeMap <Word,Word> fillWord(TreeMap <Word,Word> words, String myFile){
      TextFileInput file1 = new TextFileInput(myFile);
      String nextword = file1.readLine();
      while(nextword != null){
          try { // add word to map
              Word n = new Word(nextword);
              words.put(n,null);
          }
          catch(IllegalWordException e){

          }
          finally {
              nextword = file1.readLine();
          }
      }
      return words;
  }
}