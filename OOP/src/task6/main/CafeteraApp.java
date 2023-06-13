package task6.main;

import task6.cafetera.Cafetera;
import task6.servicio.ServiceCafetera;
/**
 *
 * @author Felipe Sandim
 */
public class CafeteraApp {
    public static void main(String[] args) {
        ServiceCafetera service = new ServiceCafetera();
        
        Cafetera c1 = service.crear();
        
        service.llenar(c1);
        service.servirTaza(c1);
        service.agregar(c1);
        System.out.println("Ahora hay: " + c1.getCapacidadActual() + "ml");
    }
}
