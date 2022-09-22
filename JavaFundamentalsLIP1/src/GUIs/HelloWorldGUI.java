/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import javax.swing.*;
/**
 *
 * @author maumneto
 */
public class HelloWorldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha GUI");
        JLabel hello = new JLabel();
        hello.setText("Olá, minha primeira GUI");
        frame.setLayout(null);
        frame.getContentPane().add(hello);
        
        hello.setBounds(30, 20, 300, 20);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(false);
    }
}
