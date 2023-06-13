package task6.servicio;

import java.util.Scanner;
import task6.cafetera.Cafetera;
/**
 *
 * @author Felipe Sandim
 */
public class ServiceCafetera {
    Scanner read = new Scanner(System.in);
    
    public Cafetera crear() {
        System.out.println("Ingrese la capacidad máxima de la cafetera");
        int capMax = read.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera");
        int canActual = read.nextInt();
        
        return new Cafetera(capMax, canActual);
    }
    
    public void llenar(Cafetera cafe) {
        cafe.setCapacidadActual(cafe.getCapacidadMax());
        System.out.println("Se lleno la cafetera");
    }
    
    public void servirTaza(Cafetera cafe) {
        System.out.println("Ingrese el tamaño de la taza");
        int tamaño = read.nextInt();
        
        int cantidadCafe = cafe.getCapacidadActual();
        int diferencia = tamaño - cantidadCafe;
        
        if (diferencia > 0) {
            cafe.setCapacidadActual(0);
            System.out.println("La capacidad actual del café no alcanza a llenar la taza");
            System.out.println("Aún así se llenará con lo que quede de cafe");
            System.out.println("La taza quedo con " + cantidadCafe + "ml. Faltan " + diferencia + "ml para llenar la taza.");
        } else {
            cafe.setCapacidadActual(-diferencia);
            System.out.println("La taza se llenó");
            System.out.println("Sobraron " + (-diferencia) + "ml.");
        }
    }
    
    public void vaciar(Cafetera cafe) {
        cafe.setCapacidadActual(0);
        System.out.println("Cafetera vacía...");
    }
    
    public void agregar(Cafetera cafe) {
        int capacidadMax = cafe.getCapacidadMax();
        int capacidadActual = cafe.getCapacidadActual();
        System.out.println("Ingrese una cantidad de café para agregar a la cafetera");
        int cantidad = read.nextInt();
        
        if ((cantidad + capacidadActual) >= capacidadMax) {
            System.out.println("La cantidad que quiere ingresar junto a lo que ya hay en la cafetera es mayor a la capacidad máxima");
            System.out.println("Igualmente se agregará hasta que se llene.");
            System.out.println("Llenando... " + capacidadMax + "/" + capacidadMax + "ml");
            System.out.println("Sobró: " + ((cantidad + capacidadActual) - capacidadMax) + "ml");
        } else if ((cantidad + capacidadActual) < capacidadMax) {
            System.out.println("Llenando...");
            System.out.println("Se llenaron " + (cantidad + capacidadActual) + "/" + capacidadMax);
        }
    }
}
