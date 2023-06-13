package task1.main;

import task1.libro.Libro;
import task1.servicio.ServicioLibro;
/**
 *
 * @author Felipe Sandim
 */
public class LibroApp {
    public static void main(String[] args) {
        // Creamos un objeto de la clase de servicio del libro
        ServicioLibro l1 = new ServicioLibro();
        
        // Llamamos función del servicio para poner datos del libro
        Libro libro1 = l1.cargarLibro();
        
        // Llama función para mostrar el Libro creado a partir del objeto "libro1"
        System.out.println(libro1.mostrarLibro());
    }
}
