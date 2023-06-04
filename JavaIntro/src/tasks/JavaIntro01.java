/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class JavaIntro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = read.nextInt();
        int resultado = suma(num1, num2);
        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " --> " + resultado);
    }
    
    public static int suma(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }
}
