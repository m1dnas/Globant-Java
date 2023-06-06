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
public class JavaIntro17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int []arr = new int[n];
        fillArray(arr, n);
        countDigit(arr, n);
    }
    
    private static void fillArray(int []arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
    }
    
    private static void countDigit(int []arr, int n) {
        int uno = 0; int dos = 0; int tres = 0; int cuatro = 0; int cinco = 0;
        for (int i = 0; i < n; i++) {
            String aux = String.valueOf(arr[i]);
            if (aux.length() == 1) {
                uno++;
            } else if (aux.length() == 2) {
                dos++;
            } else if (aux.length() == 3) {
                tres++;
            } else if (aux.length() == 4) {
                cuatro++;
            } else if (aux.length() == 5 ) {
                cinco++;
            }
        }
        
        System.out.println("Hay " + uno + " elementos con 1 digito.");
        System.out.println("Hay " + dos + " elementos con 2 digitos.");
        System.out.println("Hay " + tres + " elementos con 3 digitos.");
        System.out.println("Hay " + cuatro + " elementos con 4 digitos.");
        System.out.println("Hay " + cinco + " elementos con 5 digitos.");
    }
}
