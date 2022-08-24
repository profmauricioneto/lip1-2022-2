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
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float altura, pesoIdeal = 0;
        String genero;
        System.out.println("Digite sua altura: ");
        altura = input.nextFloat();
        System.out.println("Digite seu genero[h/m]: ");
        genero = input.next();
        genero = genero.toLowerCase();
        // utilizando switch
        switch(genero) {
            case "homem":
            case "h":
                pesoIdeal = (float)72.7*altura - 58;   
                break;
            case "mulher":
            case "m":
                pesoIdeal = (float)(62.1*altura - 44.7);
                break;
            default:
                System.out.println("Nenhum genero valido foi selecionado!");
        }
        if (pesoIdeal == 0.0) {
            System.out.println("Error no calculo!");
        } else {
            System.out.println("Peso Ideal: " + pesoIdeal);
        }
        input.close();
    }
}
