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
public class JavaIntro13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de elementos");
        int el = read.nextInt();
        
        for (int i = 0; i < el; i++) {
            for (int j = 0; j < el; j++) {
                if (j == el - 1) {
                    System.out.println("*");
                } else if (i == 0 || j == 0 || i == el - 1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}