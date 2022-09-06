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
public class Question9 {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Say your name: ");
        name = scan.next();
        TestFunctioon test = new TestFunctioon();
        test.greeting(name);
    }
}
