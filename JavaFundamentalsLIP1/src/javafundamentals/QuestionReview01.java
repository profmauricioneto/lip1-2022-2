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
public class QuestionReview01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c;
        System.out.print("A: ");
        a = scan.nextFloat();
        System.out.print("B: ");
        b = scan.nextFloat();
        System.out.print("C: ");
        c = scan.nextFloat();
        // verifica se é equação do 2th grau
        if(a == 0) {
            System.out.println("Não é equação do 2th grau");
        } else {
            double delta, x1, x2;
            delta = b*b - 4*a*c;
            //verifico o caso do delta
            if (delta < 0) {
                System.out.println("Não existe raiz real");
            } else if (delta == 0) {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("Tem somente uma raiz: " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Possui duas raizes reais!");
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        }
        scan.close();
    }
}
