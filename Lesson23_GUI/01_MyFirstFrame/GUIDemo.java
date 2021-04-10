//Creating a Frame
//package edu.ucalgary.ensf409;

import javax.swing.*;
import java.awt.*;

public class GUIDemo {
    public static void main(String args[]) {

        EventQueue.invokeLater(() -> {//thread that will pass actions like clicks and such
            // thread concurrency is important for GUI's
            JFrame frame = new JFrame("My First Frame"); //creating object JFrame
            frame.setSize(400, 400); //setSize of frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//defining what happens to the program once the user
                                                                 // closes it, in this case terminating program if exit button is closed
            frame.setVisible(true); //set visibility to be true to actually see the frame
        });
    }
}
