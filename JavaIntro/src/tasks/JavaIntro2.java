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
public class JavaIntro2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = read.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
