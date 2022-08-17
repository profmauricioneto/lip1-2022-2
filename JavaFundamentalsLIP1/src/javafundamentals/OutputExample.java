/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

/**
 *
 * @author maumneto
 */
public class OutputExample {
    public static void main(String[] args) {
        final double pi = 3.1415;
        int age = 25;
        int x = 10, y = 12;   
//        for(i = 0; i < 10; ++i) {
//            res = i * 2;
//            System.out.println(res);
//        }        
        System.out.print("Valor do PI: " + pi + "\n");
        System.out.println("Sua idade é " + age);
        System.out.printf("Sua idade é %d \n", age);
        System.out.printf("Valor do PI %.2f \n", pi);
    }
}
