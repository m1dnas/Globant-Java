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
public class JavaIntro20 {
    public static void main(String[] args) {
        int[][]matriz = createMatriz3x3();
        boolean result = verifyMagica(matriz);
        if (result == true) {
            System.out.println("LA MATRIZ ES UN CUADRADO MÁGICO!");
        } else {
            System.out.println("LA MATRIZ NO ES UN CUADRADO MÁGICO!");
        }
    }
    
    private static int[][] createMatriz3x3() {
        Scanner read = new Scanner(System.in);
        int [][]matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el valor de matriz[" + i + "][" + j + "]");
                    System.out.println("El valor debe estar entre 1 y 9");
                    matriz[i][j] = read.nextInt();
                } while (matriz[i][j] <= 0 || matriz[i][j] > 9);
            }
        }
        return matriz;
    }
    
    private static boolean verifyMagica(int matriz[][]) {
        int sumaBase = 0, sumaAux = 0, sumaAux2 = 0, sumaDiagonal = 0, sumaDiagonal2 = 0;
        // recolectar valores de filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaAux += matriz[i][j];
                sumaAux2 += matriz[j][i];
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                } if (i == 0) {
                    sumaBase += matriz[0][j];
                } if (i + j == 2) {
                    sumaDiagonal2 += matriz[i][j];
                }
            }
            // verificar filas y columnas
            if (sumaBase != sumaAux) {
                return false;
            } else if (sumaBase != sumaAux2) {
                return false;
            } else {
                sumaAux = 0;
                sumaAux2 = 0;
            }
        }
        // verificar diagonales
        if (sumaBase != sumaDiagonal) {
            return false;
        } else if (sumaBase != sumaDiagonal2) {
            return false;
        } else {
            return true;
        }
    }
}