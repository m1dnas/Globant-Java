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
public class JavaIntro16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un tamaño para el array");
        int n = read.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Ingrese un número a buscar en el vector");
        int find = read.nextInt();
        ArrayList<Integer> findList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                findList.add(i);
            } else if (i == n - 1 && findList.isEmpty()) {
                System.out.println("El número que ingresaste no se encuentra en el vector");
                return;
            }
        }
        
        System.out.print("El número " + find + " está en: ");
        for (int j = 0; j < findList.size(); j++) {
            if (j == findList.size() - 1) {
                System.out.println(findList.get(j));
            } else {
                System.out.print(findList.get(j) + ", ");
            }
        }
        
        if (findList.size() > 1) {
            System.out.println("El número " + find + " se repite " + findList.size() + " veces");
        } else {
            System.out.println("El número " + find + " se repite 1 vez");
        }
    }
}