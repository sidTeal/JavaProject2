package tisdaleproject2;

import java.awt.Color;
import javax.swing.WindowConstants;

/******************************************************
***  Class Name: TisdaleProject2
***  Class Author: Chris Tisdale 
******************************************************
*** Purpose of the class:
*** This class simply creates a new instance of the CarCreatorGUI, sets color white,
*** sets the title, sets it to be visible, and sets exit as default close operation.
****************************************************** 
*** September 19, 2017
******************************************************
*** August 30:      Reviewed assignment and created design for my program and
***                 implemented with pseudocode.
*** August 31:      Created TisdaleProject2, CarCreaterGui and Car classes.
***                 Tested the input and verified the output of the program, as well as error catching.
*** September 7:    Added comments and final testing.
******************************************************
***  
*******************************************************/
public class TisdaleProject2 {

    public static void main(String[] args) {
        CarCreatorGUI GUI = new CarCreatorGUI();
        GUI.getContentPane().setBackground(Color.white);
        GUI.setTitle("Car Creator");
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}
