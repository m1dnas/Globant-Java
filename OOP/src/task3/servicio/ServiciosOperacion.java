package task3.servicio;

import java.util.Scanner;
import task3.operacion.Operacion;
/**
 *
 * @author Felipe Sandim
 */
public class ServiciosOperacion {
    Scanner read = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer número");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = read.nextInt();
        return new Operacion(num1, num2);
    }
    
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
    
    public int resta(int num1, int num2) {
        return num1 - num2;
    }
    
    public double multiplicar(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR: se multiplicó por 0");
            return 0;
        } else {
            return num1 * num2;
        }
    }
    
    public double division(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR: no se puede dividir por 0");
            return 0;
        } else {
            return (double) num1 / num2;
        }
    }
}
