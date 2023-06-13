package task1.main;

import task1.libro.Libro;
import task1.servicio.servicioLibro;
/**
 *
 * @author Felipe Sandim
 */
public class libroApp {
    public static void main(String[] args) {
        // Creamos un objeto de la clase de servicio del libro
        servicioLibro l1 = new servicioLibro();
        
        // Llamamos función del servicio para poner datos del libro
        Libro libro1 = l1.cargarLibro();
        
        // Llama función para mostrar el Libro creado a partir del objeto "libro1"
        System.out.println(libro1.mostrarLibro());
    }
}
