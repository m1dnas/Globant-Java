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
public class JavaIntro8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String word = read.nextLine();
        System.out.println("Verificando si tiene 8 caracteres...");
        if (word.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
