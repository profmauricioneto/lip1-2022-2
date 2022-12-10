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
public class QuestionReview2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Digite um valor inteiro: ");
        number = scan.nextInt();
        if (number < 0) {
            System.out.println("Não existe fatorial negativo!");
        } else if (number == 0) {
            System.out.println("1");
        } else {
            int fat = 1;
            for(int i = number; i <=number; i++) {
                fat = fat*i;
                System.out.println(fat);
            }
            System.out.println("Fatorial é: " + fat);
        }
        scan.close();
    }
}
