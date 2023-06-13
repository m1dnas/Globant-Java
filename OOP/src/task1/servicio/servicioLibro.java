package task1.servicio;

import java.util.Scanner;
import task1.libro.Libro;
/**
 *
 * @author Felipe Sandim
 */
public class servicioLibro {
    private Scanner read = new Scanner(System.in);
    
    // devuelve un objeto de la clase libro; con sus datos del constructor
    public Libro cargarLibro() { 
        
        System.out.println("Ingrese el ISBN del libro");
        int ISBN = read.nextInt();
        System.out.println("Ingrese el título del libro");
        String titulo = read.next();
        System.out.println("Ingrese la cantidad de páginas del libro");
        int num_pag = read.nextInt();
        System.out.println("Ingrese el autor del libro");
        String autor = read.next();
        
        return new Libro(ISBN, num_pag, titulo, autor);
    }
}
