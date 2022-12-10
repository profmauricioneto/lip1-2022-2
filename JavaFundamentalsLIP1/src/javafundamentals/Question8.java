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
public class Question8 {
    public static void main(String[] args) {
        int sumMainDiag = 0;
        int matrix[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor m[%d][%d]: ", i, j);
                matrix[i][j] = scan.nextInt();
                // condicional para avaliar se o elemento é da diagonal principal ou não
                if (i == j) {
                    sumMainDiag = sumMainDiag + matrix[i][j];
                }
            }
        }
        System.out.println("O somatório da diagonal principal é: " + sumMainDiag);
        scan.close();
    }
}
