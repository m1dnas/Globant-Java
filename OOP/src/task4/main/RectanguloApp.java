package task4.main;

import task4.rectangulo.Rectangulo;
import task4.servicio.ServicioRectangulo;
/**
 *
 * @author Felipe Sandim
 */
public class RectanguloApp {
    public static void main(String[] args) {
        ServicioRectangulo servicio = new ServicioRectangulo();
        
        Rectangulo r1 = servicio.crearRectangulo();
        
        System.out.println(">>> RECTÁNGULO <<<");
        servicio.dibujar(r1);
        System.out.println("Superficie del rectángulo: " + servicio.superficie(r1));
        System.out.println("Perímetro del rectángulo: " + servicio.perimetro(r1));
    }
}
