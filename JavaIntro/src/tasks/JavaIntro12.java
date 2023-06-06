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
public class JavaIntro12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>> BIENVENIDO AL DISPOSITIVO RS232 <<<<<<<<<<<<<");
        String input;
        int correct = 0, incorrect = 0, total = 0;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Si desea finalizar los envíos escriba la secuencia especial");
            System.out.println("--------------- SECUENCIA ESPECIAL: '&&&&&' ---------------");
            System.out.println("------------- Envie una cadena de 5 caracteres ------------");
            input = read.nextLine();
            if (verifyRS232(input) == true) {
                correct++;
                total++;
            } else if (input.equals("&&&&&")) {
                break;
            } else {
                incorrect++;
                total++;
            }
        } while (!input.equals("&&&&&"));
        
        System.out.println("-------- INFORME FINAL --------");
        System.out.println("LECTURAS RECIBIDAS: " + total);
        System.out.println("LECTURAS CORRECTAS: " + correct);
        System.out.println("LECTURAS INCORRECTAS: " + incorrect);
    }
    
    private static boolean verifyRS232(String input) {
        if (input.length() == 5 && input.substring(0, 1).equals("X") && input.substring(4, 5).equals("O")) {
            return true;
        } else {
            return false;
        }
    }
}
