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
public class JavaIntro19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = read.nextInt();
        int [][]matriz = createMatriz(n);
        int [][]traspuesta = traspuestaMatriz(matriz, n);
        
        if (verifyAntiSimetrica(matriz, n)) {
            System.out.println("LA MATRIZ ES ANTISIMÉTRICA");
            System.out.println("LA MATRIZ ORIGINAL:");
            showMatriz(matriz, n);
            System.out.println("LA MATRIZ TRANSPUESTA:");
            showMatriz(traspuesta, n);
        } else {
            System.out.println("LA MATRIZ NO ES ANTISIMÉTRICA");
            System.out.println("LA MATRIZ ORIGINAL:");
            showMatriz(matriz, n);
            System.out.println("LA MATRIZ TRANSPUESTA:");
            showMatriz(traspuesta, n);
        }
    }
    
    private static int[][] traspuestaMatriz(int [][]matriz, int n) {
        if (matriz.length == 0) {
            System.out.println("La matriz está vacía");
            return matriz;
        } else {
            int [][]aux = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    aux[j][i] = matriz[i][j];
                }
            }
            return aux;
        }
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
    
    private static boolean verifyAntiSimetrica(int matriz[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
