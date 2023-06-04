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
public class JavaIntro11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        double num1 = read.nextDouble();
        System.out.println("Ingrese otro número entero positivo");
        double num2 = read.nextDouble();
        
        String answer = "N";
        
        do {
            showMenu();
            int option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es: " + (num1 / num2));
                    break;
                case 5:
                    do {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        answer = read.next().toUpperCase();
                    } while (!answer.equals("N") && !answer.equals("S"));
                    if (answer.equals("S")) {
                        System.out.println("Saliendo del menu...");
                        break;
                    }
                default:
                    System.out.println("Ingrese un número correcto");
            }
        } while(answer.equals("N"));
    }
    
    private static void showMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opción:");
    }
}
