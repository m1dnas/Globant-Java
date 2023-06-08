/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Felipe
 */
public class JavaIntro21 {
    public static void main(String[] args) {
        int matrizM[][] = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
        };
        System.out.println("Dada la matriz M de tamaño 10x10:");
        showMatriz(matrizM, 10);
        System.out.println("----------------------------------------");
        System.out.println("Escriba una submatriz 3x3 forme parte en la matriz M");
        int [][]submatriz = createMatriz(3);
        ArrayList<Integer> arr= findMatriz(matrizM, submatriz);
        if (!arr.isEmpty()) {
            System.out.println("La submatriz ingresada se encuentra en la matriz M");
            // indicar las coordenadas
            System.out.println("En los siguientes índices:");
            for (int i = 0; i < 9; i++) {
                int unidad = arr.get(i) % 10;
                int decena = arr.get(i) / 10;
                if (i != 8) {
                System.out.print(decena + "," + unidad + " - ");
                } else {
                    System.out.println(decena + "," + unidad + ".");
                }
            }
        } else {
            System.out.println("La submatriz ingresada no se encuentra en la matriz M");
        }
    }
    
    private static ArrayList<Integer> findMatriz(int matriz[][], int submatriz[][]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int index = 0, index2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == submatriz[0][0]) {
                    boolean match = true;
                    for (int k = i; k < i + 3; k++) {
                        for (int n = j; n < j + 3; n++) {
                            if (matriz[k][n] != submatriz[index][index2]) {
                                match = false;
                                // limpia el array para q se puedan agregar elementos desde 0,
                                // por si futuramente matchea
                                arr.clear();
                                index = 0;
                                index2 = 0;
                                break;
                            } else {
                                arr.add((k * 10) + n);
                                if (index2 == 2) {
                                    index2 = 0;
                                    index++;
                                } else {
                                    index2++;
                                }
                            }
                        }
                        if (!match) {
                            break;
                        }
                    }
                    if (match) {
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
    
    private static int[][] createMatriz(int n) {
        Scanner read = new Scanner(System.in);
        int [][]matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de matriz[" + i + "][" + j + "]");
                matriz[i][j] = read.nextInt();
            }
        }
        return matriz;
    }
    
    private static void showMatriz(int[][]matriz, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if (j != n - 1) {
                    System.out.print(matriz[i][j] + ", ");
                } else {
                    System.out.println(matriz[i][j] + "]");
                }
            }
        }
    }
}
