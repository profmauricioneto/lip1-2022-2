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
public class Example0 {

    public static void main(String[] args) {
        float fah, cel;
        int option;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a opção:\n[1-fahrenheit - celsius]\n[2- celsius - fahrenheit]\nResp: ");
        option = input.nextInt();
        if (option == 1) {
            System.out.print("Digite o valor em Celsius: ");
            cel = input.nextFloat();
            fah = cel * 1.8f + 32;
            System.out.println("Fahrenheit: " + fah);
        } else if (option == 2) {
            System.out.print("Digite o valor em Fahrenheit: ");
            fah = input.nextFloat();
            cel = (fah - 32) / 1.8f;
            System.out.println("Celsius: " + cel);
        } else {
            System.out.print("Nenhum opção foi selecionada!\n");
        }
    }
}
