//package edu.ucalgary.ensf409;

import java.awt.BorderLayout;
import java.awt.EventQueue;//concurrency 
import javax.swing.*;//for all components 
import java.awt.event.*;
import java.awt.FlowLayout;

public class GUIPetID extends JFrame implements ActionListener, MouseListener{//extends JFrame which means GUIPetID 
                                                                            //is a frame itself
    // All are frame variables 
    //taking in input from user
    private String firstName;
    private String lastName;
    private String petName;
    private int birthYear;
    
   //some labels
    private JLabel instructions;
    private JLabel fnLabel;
    private JLabel lnLabel;
    private JLabel petLabel;
    private JLabel yearLabel;
    //text fields
    private JTextField fnInput;
    private JTextField lnInput;
    private JTextField petInput;
    private JTextField yearInput;
    
    public GUIPetID(){
        super("Create a PetID"); //as extends JFrame, can pass in title of JFrame, inheritance, calling constructor
                                 // of parent class
        setupGUI();
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //has many other functionalities other than .EXIT_ON_CLOSE 
        
    }
    
    public void setupGUI(){
        
        instructions = new JLabel("Please enter your information to generate an identifier.");
        fnLabel = new JLabel("First Name:");
        lnLabel = new JLabel("Last Name:");
        petLabel = new JLabel("Pet Name:");
        yearLabel = new JLabel("Pet Birth Year:");
        
        //example data
        //text boxes that user will enter data inside
        fnInput = new JTextField("e.g. Dorothy", 15);
        lnInput = new JTextField("e.g. Gale", 15);
        petInput = new JTextField("e.g. Toto", 15);
        yearInput = new JTextField("e.g. 2000", 15);    
        
        //add MouseListener to each of these TextFields
        fnInput.addMouseListener(this);
        lnInput.addMouseListener(this);
        petInput.addMouseListener(this);
        yearInput.addMouseListener(this);
        
        JButton submitInfo = new JButton("Submit"); //submit button
        submitInfo.addActionListener(this);//adding action listener to the Submit button
        
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout());//top 
        
        JPanel clientPanel = new JPanel();
        clientPanel.setLayout(new FlowLayout());//middle

        JPanel submitPanel = new JPanel();
        submitPanel.setLayout(new FlowLayout());//bottom
        
        //have to go in this order because of FlowLayout of panels
        headerPanel.add(instructions);//label
        clientPanel.add(fnLabel);//label
        clientPanel.add(fnInput);//text field
        clientPanel.add(lnLabel);//label
        clientPanel.add(lnInput);//text field
        clientPanel.add(petLabel);//label
        clientPanel.add(petInput);//text field
        clientPanel.add(yearLabel);//label
        clientPanel.add(yearInput);//text field
        submitPanel.add(submitInfo); //button
        
        //panels needed to added to the frame
        //frame itself will use BorderLayout.
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(clientPanel, BorderLayout.CENTER);
        this.add(submitPanel, BorderLayout.PAGE_END);
    }
    
    public void actionPerformed(ActionEvent event){
        lastName = lnInput.getText();
        firstName = fnInput.getText();
        petName = petInput.getText();
        birthYear = Integer.parseInt(yearInput.getText());
        
        if(validateInput()){
            String petID = idProcessing();
            JOptionPane.showMessageDialog(this, "Your pet's clinic ID is " + petID);
        }
    }
    
    public void mouseClicked(MouseEvent event){
        
        if(event.getSource().equals(fnInput))
            fnInput.setText("");//override the current text if textField was clicked

        if(event.getSource().equals(lnInput))
            lnInput.setText("");//override the current text if textField was clicked


        if(event.getSource().equals(petInput))
            petInput.setText("");//override the current text if textField was clicked


        if(event.getSource().equals(yearInput))
            yearInput.setText("");//override the current text if textField was clicked

                
    }
    
    public void mouseEntered(MouseEvent event){//do nothing
        
    }

    public void mouseExited(MouseEvent event){//do nothing
        
    }

    public void mousePressed(MouseEvent event){
        //do nothing
    }

    public void mouseReleased(MouseEvent event){//do nothing
        
    }
    
    private String idProcessing(){

        String petID = new String(String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0)) + String.valueOf(petName.charAt(0)) + String.valueOf(birthYear));
        
        return petID;
    }    
    
    private boolean validateInput(){
        
        boolean allInputValid = true;
        
        if(!Character.isUpperCase(firstName.charAt(0)) || firstName.length() < 2 || firstName.length() > 26){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, firstName + " is an invalid name input.");
        }
        
        if(!Character.isUpperCase(lastName.charAt(0)) || lastName.length() < 2 || lastName.length() > 26){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, lastName + " is an invalid name input.");
        }

        if(!Character.isUpperCase(petName.charAt(0)) || petName.length() < 2 || petName.length() > 26){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, petName + " is an invalid name input.");
        }

        if(birthYear < 1921 || birthYear > 2021){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, birthYear + " is an invalid birth year. Pets must be born between 1921 and 2021.");
        }
        
        return allInputValid;
        
    }

    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {// EventQueue for concurrency issues, lambda expression 
            new GUIPetID().setVisible(true);        
        });
    }
        
}
