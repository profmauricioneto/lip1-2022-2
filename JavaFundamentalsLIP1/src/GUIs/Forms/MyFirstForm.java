/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs.Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFirstForm extends JFrame {
    JLabel lbl_hello, lbl_result;
    JButton btn_ok;
    
    public MyFirstForm() {
        super("my first form");
        lbl_hello = new JLabel("Hello World from Forms");
        btn_ok = new JButton("Click Here");
        lbl_result = new JLabel();
        
        Container cont = getContentPane();
        cont.add(lbl_hello);
        cont.add(btn_ok);
        cont.add(lbl_result);
        
        setLayout(null);
        
        lbl_hello.setBounds(20, 20, 200, 30);
        btn_ok.setBounds(100, 60, 100, 30);
        lbl_result.setBounds(20, 80, 200, 30);
        
        Event myevent = new Event();
        btn_ok.addActionListener(myevent);
        
        setSize(300, 400);
        setVisible(true);
    }
    
    private class Event implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lbl_result.setText("Button Clicked!");
        }
    }
    
    
    public static void main(String[] args) {
        MyFirstForm form = new MyFirstForm();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
