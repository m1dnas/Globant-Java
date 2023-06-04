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
public class JavaIntro7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase y se verificará si es 'eureka'");
        String frase = read.nextLine();
        frase = frase.toLowerCase();
        if (frase.equals("eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}
