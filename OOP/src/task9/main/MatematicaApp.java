package task9.main;

import task9.matematica.Matematica;
/**
 *
 * @author Felipe Sandim
 */
public class MatematicaApp {
    public static void main (String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();
        Matematica math1 = new Matematica(num1, num2);
        
        double mayor = math1.devolverMayor(num1, num2);
        double potencia = math1.calcularPotencia(num1, num2);
        double raiz = math1.calcularRaiz(num1, num2);
        
        System.out.println(">>>> MATH <<<<");
        System.out.println("NUM1: " + num1 + " | NUM2: " + num2);
        System.out.println("EL MAYOR ES: " + mayor);
        System.out.println("LA POTENCIA ES: " + potencia);
        System.out.println("LA RAIZ ES: " + raiz);
    }
}
