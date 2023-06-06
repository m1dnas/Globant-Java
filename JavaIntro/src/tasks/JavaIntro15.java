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
public class JavaIntro15 {
    public static void main(String[] args) {
        int []arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.print("[");
        for (int i = 100; i > 0; i--) {
            if (i != 1) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i + "]");
            }
        }
    }
}
