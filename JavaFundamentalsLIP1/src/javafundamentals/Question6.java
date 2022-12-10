package javafundamentals;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author maumneto
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index;
        float serieHarm = 0;
        System.out.print("Digite a quantidade de termos: ");
        index = scan.nextInt();
        for(int i = 1; i <= index; i++) {
            serieHarm = serieHarm + (float)1/i;
        }
        System.out.println("Serie Harmonica: " + serieHarm);
        scan.close();
    }
}
