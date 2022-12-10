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
        // criar variável de contagem de pares
        int contPair = 0;
        int valores[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o valor de v[%d]: ", i);
            valores[i] = scan.nextInt();
            // criar estrutura de decisão para captar pares
            if (valores[i] % 2 == 0) {
                contPair++;
            }
        }
        System.out.println("A quantidade de pares nesse vetor é: " + contPair);
        scan.close();
//        for(int i = 0; i < valores.length; i++) {
//            System.out.println("Saida: " + valores[i]);
//        }
    }
}
