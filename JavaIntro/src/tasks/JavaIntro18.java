/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author Felipe
 */
public class JavaIntro18 {
    public static void main(String[] args) {
        int [][]matriz = new int[4][4];
        
        System.out.println("Rellenando matriz 4x4 de valores aleatorios...");
        fill4x4(matriz);
        show4x4(matriz);
        int [][]traspuesta = traspuesta4x4(matriz);
        show4x4(traspuesta);
    }
    
    private static void show4x4(int[][]matriz) {
        for (int i = 0; i < 4; i++) {
            System.out.print("[");
            for (int j = 0; j < 4; j++) {
                if (j != 3) {
                    System.out.print(matriz[i][j] + ", ");
                } else {
                    System.out.println(matriz[i][j] + "]");
                }
            }
        }
    }
    
    private static void fill4x4(int [][]matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    private static int[][] traspuesta4x4(int [][]matriz) {
        if (matriz.length == 0) {
            System.out.println("La matriz está vacía");
            return matriz;
        } else {
            int [][]aux = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    aux[j][i] = matriz[i][j];
                }
            }
            System.out.println("MATRIZ TRASPUESTA CORRECTAMENTE");
            return aux;
        }
    }
}