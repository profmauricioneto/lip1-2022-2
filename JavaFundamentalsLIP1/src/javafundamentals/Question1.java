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
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.1415;
        float radiano, graus;
        /* entrada de dados */
        System.out.print("Digite o valor em graus: ");
        graus = input.nextFloat();
        input.close();
        /* calculo da conversão */
        //radiano = (float)(graus*PI)/180;
        radiano = (float)(graus*Math.PI)/180;
        /* saida de dados */
        System.out.println("O valor em radianos é: "+radiano);
    }
}
