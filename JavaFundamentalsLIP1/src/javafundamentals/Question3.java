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
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float np1, np2, media;
        System.out.print("Digite a nota da NP1: ");
        np1 = input.nextFloat();
        System.out.print("\nDigite a nota da NP2: ");
        np2 = input.nextFloat();
        media = (np1 + np2)/2;
        System.out.println("\nA média é: " + media);
        // condição
        if (media >= 7.0) {
            System.out.println("Aprovado. Tchau!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai mesmo...");
            } else {
                System.out.println("Está na FINAL. Vamo ver... ");
            }
        }
       
    }
}
