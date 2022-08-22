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
public class Question2 {
    public static void main(String[] args) {
        int hour;
        float hourValue, salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite as horas trabalhadas: ");
        hour = input.nextInt();
        System.out.print("\nDigite o valor da hora: ");
        hourValue = input.nextFloat();
        input.close();
        salary = hourValue*hour;
        System.out.println("\n+ Salário Bruto: " + salary);
        float ir, inss, sind, realSalary;
        ir = salary*0.11f;
        inss = salary*0.08f;
        sind = salary*0.05f;
        System.out.println("- IR: " + ir);
        System.out.println("- INSS: " + inss);
        System.out.println("- SINDICATO: " + sind);
        realSalary = salary - ir - inss - sind;
        System.out.println("= Salario Linquido: " + realSalary);
    }
}
