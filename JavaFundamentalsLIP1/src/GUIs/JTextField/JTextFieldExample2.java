/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs.JTextField;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Set;
/**
 *
 * @author maumneto
 */
public class JTextFieldExample2 {

    public static void main(String[] args) {
        // create the elements of the GUI
        JFrame SCREEN = new JFrame("Second Example JTextField");

        JLabel LABELNAME = new JLabel("Name");
        JLabel LABELLASTNAME = new JLabel("Last Name");
        JTextField TEXTFIELDNAME = new JTextField();
        JTextField TEXTFIELDLASTNAME = new JTextField();
        JButton BUTTONSHOWNAME = new JButton("Show");
        JLabel RESULTLABEL = new JLabel("");
        
        // create the container to put the elements of the GUI
        Container CONT = SCREEN.getContentPane();
        
        // adding the elements in the frame
        CONT.add(LABELNAME);
        CONT.add(LABELLASTNAME);
        CONT.add(TEXTFIELDNAME);
        CONT.add(TEXTFIELDLASTNAME);
        CONT.add(BUTTONSHOWNAME);
        CONT.add(RESULTLABEL);
        
        // disable of auto-layout
        SCREEN.setLayout(null);
        
        // adjust the position of the 
        LABELNAME.setBounds(20, 20, 300, 30);
        TEXTFIELDNAME.setBounds(20, 50, 300, 30);
        LABELLASTNAME.setBounds(20, 80, 300, 30);
        TEXTFIELDLASTNAME.setBounds(20, 110, 300, 30);
        BUTTONSHOWNAME.setBounds(20, 140, 100, 30);
        RESULTLABEL.setBounds(20, 170, 300, 30);
        
        // adding an event when the button was clicked
        BUTTONSHOWNAME.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = TEXTFIELDNAME.getText();
                String lastName = TEXTFIELDLASTNAME.getText();
                String hello = "Hello Mr(s) " + name + " " + lastName;
                RESULTLABEL.setText(hello);
                TEXTFIELDNAME.setText("");
                TEXTFIELDLASTNAME.setText("");
            }
        });
        
        // configure the frame
        SCREEN.setVisible(true);
        SCREEN.setSize(400, 400);
        SCREEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
