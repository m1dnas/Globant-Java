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
public class JavaIntro14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de euros");
        double euros = read.nextDouble();
        read.nextLine(); // Consumir el carácter de nueva línea que queda en el búfer
        System.out.println("Ingrese la moneda a convertir");
        String moneda = read.nextLine().toLowerCase();
        convertirEuros(euros, moneda);
    }
    
    private static void convertirEuros(double euros, String moneda) {
        if (moneda.equals("dolares")) {
            double dolares = euros * 1.28611;
            System.out.println(euros + " euros son " + dolares + " dólares");
        } else if (moneda.equals("yenes")) {
            double yenes = euros * 129.852;
            System.out.println(euros + " euros son " + yenes + " yenes");
        } else if (moneda.equals("libras")) {
            double libras = euros * 0.86;
            System.out.println(euros + " euros son " + libras + " libras");
        } else {
            System.out.println("Ingrese una moneda correcta: dolares, yenes o libras");
        }
    }
}
