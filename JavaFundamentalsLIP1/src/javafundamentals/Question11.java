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
public class Question11 {
    
    public static void fibonacci(int index) {
        if (index == 1) {
            System.out.println("0");
        } else if(index == 2) {
            System.out.println("0 1");
        } else if(index > 2) {
            int fElement = 0;
            int sElement = 1;
            int aux = 0;
            System.out.println("0\n1");
            for (int i = 2; i < index; i++) {
                aux = fElement + sElement;
                System.out.println(aux);
                fElement = sElement;
                sElement = aux;
            }
        } else {
            System.out.println("Não existe série de fibonacci negativa!");
        }
    }
    
        public static void fibonacci2(int index) {
        if (index > 0) {
            int fElement = 0;
            int sElement = 1;
            int aux = 0;
            for (int i = 0; i < index; i++) {
                System.out.println(aux);
                aux = fElement + sElement;
                fElement = sElement;
                sElement = aux;
            }
        } else {
            System.out.println("Não existe série de fibonacci!");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index;
        System.out.println("Digite a quantidade de termos: ");
        index = scan.nextInt();
        fibonacci2(index);
        scan.close();
    }
}
