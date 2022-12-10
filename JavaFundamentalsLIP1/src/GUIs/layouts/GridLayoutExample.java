/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs.layouts;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author maumneto
 */
public class GridLayoutExample extends JFrame {
    
    JButton bNorth, bSouth, bEast, bWest, bCenter, bAfter, bBefore, bAfter2, bBefore2;
    
    public GridLayoutExample() {
        super("grid layout");

        bNorth = new JButton("Button North");
        bSouth = new JButton("Button South");
        bEast = new JButton("Button East");
        bWest = new JButton("Button West");
        bCenter = new JButton("Button Center");
        bAfter = new JButton("Button After");
        bAfter2 = new JButton("Button After2");
        bBefore = new JButton("Button Before");
        bBefore2 = new JButton("Button Before2");
        
        Container cont = getContentPane();
        setLayout(new GridLayout(2,3));
        
        cont.add(bNorth);
        cont.add(bSouth);
        cont.add(bEast);
        cont.add(bWest);
        cont.add(bCenter);
        cont.add(bAfter);
        cont.add(bAfter2);
        cont.add(bBefore);
//        cont.add(bBefore2);
        
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        GridLayoutExample gridExample = new GridLayoutExample();
        gridExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
