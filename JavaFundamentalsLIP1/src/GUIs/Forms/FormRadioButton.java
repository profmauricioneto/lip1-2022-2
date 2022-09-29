/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs.Forms;

import java.awt.Container;
import javax.swing.*;

public class FormRadioButton extends JFrame {
    JLabel lbl_name, lbl_gender;
    JButton btn_submit;
    JTextField tf_name;
    JRadioButton radio_btn_masc, radio_btn_fem;
    
    public FormRadioButton() {
        super("Example Radio Button");
        lbl_name = new JLabel("Entre com o nome: ");
        lbl_gender = new JLabel("Selecione seu gênero: ");
        btn_submit = new JButton("OK");
        tf_name = new JTextField();
        radio_btn_masc = new JRadioButton("Masculino", true);
        radio_btn_fem = new JRadioButton("Feminino");
        
        ButtonGroup group_radio = new ButtonGroup();
        group_radio.add(radio_btn_fem);
        group_radio.add(radio_btn_masc);
        
        Container cont = getContentPane();
        cont.add(lbl_name);
        cont.add(lbl_gender);
        cont.add(btn_submit);
        cont.add(tf_name);
        cont.add(radio_btn_masc);
        cont.add(radio_btn_fem);
        
        setLayout(null);
        
        lbl_name.setBounds(30, 30, 150, 20);
        tf_name.setBounds(180, 30, 150, 20);
        lbl_gender.setBounds(30, 50, 150, 20);
        radio_btn_masc.setBounds(180, 50, 150, 20);
        radio_btn_fem.setBounds(180, 70, 150, 20);
        
        setSize(400, 200);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        FormRadioButton example_radio = new FormRadioButton();
        example_radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
