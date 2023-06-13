package task2.servicio;

import java.util.Scanner;
import task2.circunferencia.Circunferencia;
/**
 *
 * @author Felipe Sandim
 */
public class ServicioCircunferencia {
    private Scanner read = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = read.nextDouble();
        return new Circunferencia(radio);
    }
    
    public double area(double radio) {
        return Math.PI * (radio * radio);        
    }
    
    public double perimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
