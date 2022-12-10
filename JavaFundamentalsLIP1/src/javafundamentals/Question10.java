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
public class Question10 {
    
    // function imc
    public static double calcIMC(double weight, double height) {
        double imc = 0;
        imc = weight / (height*height);
        return imc;
    }
    
    // function idea weight
    public static double calcIdeaWeight(String gender, double height) {
        double ideaWeight = 0;
        if (gender.equals("m") || gender.equals("man")) {
            ideaWeight = 72.7*height - 58;
        } else if (gender.equals("w") || gender.equals("woman")) {
            ideaWeight = 62.1*height - 44.7;
        } else {
            System.out.println("Invalid Gender!");
        }
        return ideaWeight;
    }
    
    public static void main(String[] args) {
        String gender;
        double idealWeight;
        double weight;
        double height;
        double imc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter with your weight: ");
        weight = scan.nextDouble();
        System.out.print("Enter with your height: ");
        height = scan.nextDouble();
        // call function imc
        imc = calcIMC(weight, height);
        System.out.println("IMC: " + imc);
        
        System.out.print("Enter with your gender(m-man/w-woman): ");
        gender = scan.next();
        gender = gender.toLowerCase();
        
        // call function idealWeight
        idealWeight = calcIdeaWeight(gender, height);
        System.out.println("Idea Weight: " + idealWeight);
        
        scan.close();
    }
}
