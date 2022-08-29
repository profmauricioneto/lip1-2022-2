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
public class Question7 {
    public static void main(String[] args) {
        int valores[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < valores.length; i++) {
            System.out.print("Digite o numero: ");
            valores[i] = scan.nextInt();
            System.out.println("");
        }
        for(int i = 0; i < valores.length; i++) {
            System.out.println("Saida: " + valores[i]);
        }
    }
}
