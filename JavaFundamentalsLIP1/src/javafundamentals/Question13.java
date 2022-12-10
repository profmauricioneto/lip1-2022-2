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
public class Question13 {
    public static String upperPhrase(String phrase) throws NullPointerException {
        String newPhrase;
        newPhrase = phrase.toUpperCase();
        System.out.println("New Phrase: " + newPhrase);
        return newPhrase;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = null; 
        String newPhrase = null;
        System.out.print("Write something: ");
        phrase = scan.nextLine();
        try {
            newPhrase = upperPhrase(phrase);
        } catch (NullPointerException e) {
            System.out.printf("%s", e.getCause());
            System.out.printf("%s",e.getMessage());
        } finally {
            scan.close();
            System.out.println("Continuei a execução.");
        }
        
    }
}
