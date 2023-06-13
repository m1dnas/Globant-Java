package task2.main;

import task2.circunferencia.Circunferencia;
import task2.servicio.ServicioCircunferencia;
/**
 *
 * @author Felipe Sandim
 */
public class CircunfApp {
    public static void main(String[] args) {
        ServicioCircunferencia servicio = new ServicioCircunferencia();
        
        Circunferencia s1 = servicio.crearCircunferencia();
        
        System.out.println(">> LA CIRCUNFERENCIA <<");
        System.out.println("El radio: " + s1.getRadio());
        System.out.println("El perímetro: " + servicio.perimetro(s1.getRadio()));
        System.out.println("El área: " + servicio.area(s1.getRadio()));
    }
}
