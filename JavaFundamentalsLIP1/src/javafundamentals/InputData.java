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
public class InputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Digite seu nome: ");
        name = input.nextLine();
        System.out.print("Digite sua idade: ");
        age = input.nextInt();
        input.close();
        System.out.println("Olá " + name);
        System.out.println("Voce tem: " + age + " anos");
    }
}
