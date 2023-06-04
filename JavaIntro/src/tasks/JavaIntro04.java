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
public class JavaIntro04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados centígrados");
        double grados = read.nextInt();
        System.out.println("Su equivalente en grados Fahrenheit es de: " + gradosToFahrenheit(grados));
    }
    public static double gradosToFahrenheit(double grados) {
        double Fahrenheit = (grados * 9 / 5) + 32;
        return Fahrenheit;
    }
}
