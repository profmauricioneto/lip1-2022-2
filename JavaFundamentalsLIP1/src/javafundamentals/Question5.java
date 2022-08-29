/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

/**
 *
 * @author maumneto
 */
public class Question5 {
    public static void main(String[] args) {
        int somaQuad = 0, quadSoma = 0, index = 1;
        while(index <= 10) {
            somaQuad = somaQuad + index*index;
            quadSoma = quadSoma + index;
            index++;
        }
        quadSoma = quadSoma*quadSoma;
//        quadSoma = (int) Math.pow((int)quadSoma, (int)2);
        int diff;
        diff = quadSoma - somaQuad;
        System.out.println("O quadrado da soma: " + quadSoma);
        System.out.println("A soma do quadrado: " + somaQuad);
        System.out.println("A diferença é: " + diff);
    }
}
