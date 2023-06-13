package task3.main;

import task3.operacion.Operacion;
import task3.servicio.ServiciosOperacion;
/**
 *
 * @author Felipe Sandim
 */
public class OperacionApp {
    public static void main(String[] args) {
        ServiciosOperacion service = new ServiciosOperacion();
    
        Operacion o1 = service.crearOperacion();
        System.out.println(">> LA CIRCUNFERENCIA <<");
        System.out.println("El número 1: " + o1.getNum1());
        System.out.println("El número 2: " + o1.getNum2());
        System.out.println("La suma: " + service.suma(o1.getNum1(), o1.getNum2()));
        System.out.println("La resta: " + service.resta(o1.getNum1(), o1.getNum2()));
        System.out.println("La multiplicación: " + service.multiplicar(o1.getNum1(), o1.getNum2()));
        System.out.println("La división: " + service.division(o1.getNum1(), o1.getNum2()));
    }
}
