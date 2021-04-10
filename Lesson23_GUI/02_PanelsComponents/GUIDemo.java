//package edu.ucalgary.ensf409;

import javax.swing.*;
import java.awt.*;

public class GUIDemo {
    public static void main(String args[]) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("My First Frame");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel buttonsPanel = new JPanel(); //intermediate containers, creating a new object panel that goes
                                                //on top of the frame 
            JButton myButton = new JButton("Click here!"); //initializing button, "Click here!" will be written 
                                                            // on top of button
            buttonsPanel.add(myButton);//passing button(component) on to the panel using .add
            frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);//.getContentPane gets access to the top level
                                                                        // container, then add panel to the frame
                                                                        //BorderLayout is default but you can change position
                                                                        // BorderLayout.NORTH
            frame.setVisible(true); //always set JFrame to visible to it can be seen by users
        });
    }
}
