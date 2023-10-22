// package Project0;
import javax.swing.*;

/**
 * This program takes in input sentences from the user 
 * and returns the number of lower and upper case e's 
 * until the user types 'STOP'.
 * 
 * @author Akiva Richman
 */

public class Project0 {
    public static void main(String[] args) {
        String input;
        char lowerE = 'e', upperE = 'E';
        int lowerCounter, upperCounter;
        
        while(true) { // ensures that the program repeats itself

            lowerCounter = 0;
            upperCounter = 0;
            
            input = JOptionPane.showInputDialog(null, "Please enter a sentence."); // recieves input from the user
            int length = input.length(); // establishes the length of the String input to know how many times to itirate through the for loop

            if(input.equalsIgnoreCase("Stop")) { // terminates the program if the user inputs in the word "stop"
                System.exit(0);
            }

            for(int c = 0; c < length; c++){ // this loop will iterate through the String to look at each individual character
                if(input.charAt(c) == (lowerE)) { // determines if the char is a lower case e
                    lowerCounter++;
                }
                if(input.charAt(c) == (upperE)) { // determines if the char is an upper case E
                    upperCounter++;
                }
            }

            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowerCounter + "\nNumber of upper case e's: " + upperCounter); // displays results to the user
        } // while loop
    }
} // public class Project0