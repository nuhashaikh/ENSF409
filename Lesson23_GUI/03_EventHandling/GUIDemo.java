//package edu.ucalgary.ensf409;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //one of many listener interfaces, action is for actions done an 
                                     // event handling object like the click on a button, or scroll click 
                                     // through a window
import java.awt.event.MouseEvent; //another type of listener interface
import java.awt.event.MouseListener;

public class GUIDemo implements ActionListener, MouseListener{ //event handling must implement ActionListener
                                                //if event was happening from a mouse click then implement
    
    public static void main(String args[]) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("My First Frame");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel buttonsPanel = new JPanel(); //provides a space tp attach other components, intermediate container
            JButton myButton = new JButton("Click here!");

            GUIDemo buttonListener = new GUIDemo(); //registering event to a listener object
            GUIDemo mouseListener= new GUIDemo();
            myButton.addActionListener(buttonListener); //adding ActionListener onto the button object
            myButton.addMouseListener(mouseListener);
            buttonsPanel.add(myButton);
            frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
            frame.setVisible(true);
        });
    }
    public void mouseEntered(MouseEvent e){ //when implementing a class must implement all methods required in that
                                            //interface as demonstrated by MouseListener
        
    }
    public void mouseClicked(MouseEvent e){

    }
    public void mousePressed(MouseEvent event){ //there are many other methods that can be used for a specific 
                                                // Listener interface
        JOptionPane.showMessageDialog(null, "The mouse has been pressed");
        }
    public void mouseExited(MouseEvent event){

    }
    public void mouseReleased(MouseEvent e){

    }
    
    public void actionPerformed(ActionEvent event){//interface ActionListener interface method
                                                   //must provide an implementation of for interface method
        JOptionPane.showMessageDialog(null, "This button has been pushed");
        }
    }    
