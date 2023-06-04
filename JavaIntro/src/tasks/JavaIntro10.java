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
public class JavaIntro10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int lim = read.nextInt();
        int total = 0;
        do {
            System.out.println("Ingrese un valor");
            int valor = read.nextInt();
            total = total + valor;
        } while (total <= lim);
        
        System.out.println("Se superó el valor del límite");
        System.out.println("Límite: " + lim);
        System.out.println("Suma de los valores: " + total);
    }
}
