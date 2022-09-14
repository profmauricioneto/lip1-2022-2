/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class Question12 {
    public static void main(String[] args) {
        float fvalue, svalue, res = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("First Value: ");
        fvalue = scan.nextFloat();
        System.out.print("Second Value: ");
        svalue = scan.nextFloat();
        try {
            res = fvalue / svalue;
            System.out.println(res);
        } catch(ArithmeticException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        } finally {
            scan.close();
            System.out.println("Continuo executando!");
        }
    }
}
