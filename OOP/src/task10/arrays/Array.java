package task10.arrays;

import java.util.Arrays;
/**
 *
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
 * @author Felipe Sandim
 */
public class Array {
    public static void main (String[] args) {
        double[] arrA = new double[50];
        double[] arrB = new double[20];
        
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Math.random();
        }
        
        System.out.println(">>>>>>>> ARRAY A <<<<<<<<<");
        System.out.print("[");
        for (int i = 0; i < arrA.length; i++) {
            if (i != arrA.length - 1) {
                System.out.print(arrA[i] + ", ");
            } else {
                System.out.println("]");
            }
        }
        
        Arrays.sort(arrA);
        
        arrB = Arrays.copyOf(arrA, 20);
        Arrays.fill(arrB, 10, 20, 0.5);
        
        System.out.println(">>>>>>>> ARRAY B <<<<<<<<<");
        System.out.print("[");
        for (int i = 0; i < arrB.length; i++) {
            if (i != arrA.length - 1) {
                System.out.print(arrB[i] + ", ");
            } else {
                System.out.println("]");
            }
        }
    }
}
