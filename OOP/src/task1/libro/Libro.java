/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 */
package task1.libro;

/**
 *
 * @author Felipe Sandim
 */
public class Libro {
    int ISBN, num_pag;
    String titulo, autor;
    
    public Libro(int ISBN, int num_pag, String titulo, String autor) {
        this.ISBN = ISBN;
        this.num_pag = num_pag;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public Libro() {
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getISBN() {
        return ISBN;
    }
    
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    public int getNumPag() {
        return num_pag;
    }
    
    public void setNumPag(int num_pag) {
        this.num_pag = num_pag;
    }
    
    public String mostrarLibro() {
        return ">>>> DATOS DEL LIBRO <<<<"
                + "\nISBN: " + ISBN 
                + "\nTitulo: " + titulo
                + "\nAutor: " + autor
                + "\nNúmero de páginas: " + num_pag;
    }
}
