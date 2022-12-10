package overrideandoverload;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maumneto
 */
public class Example {
    public double sum (double a, double b) {
        return a + b;
    }
    
    public double sum (double ...args) {
        double total = 0;
        for (double arg: args) {
            total += arg;
        }
        return total;
    }
    public static void main(String[] args) {
        Example x = new Example();
        System.out.println(x.sum(4,3));
    }
}
