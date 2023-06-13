package task4.servicio;

import java.util.Scanner;
import task4.rectangulo.Rectangulo;
/**
 *
 * @author Felipe Sandim
 */
public class ServicioRectangulo {
    Scanner read = new Scanner(System.in);
    
    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del rectángulo");
        int base = read.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        int altura = read.nextInt();
        return new Rectangulo(base, altura);
    }
    
    public int perimetro(Rectangulo rec) {
        return (rec.getBase() + rec.getAltura()) * 2;
    }
    
    public int superficie(Rectangulo rec) {
        return rec.getBase() * rec.getAltura();
    }
    
    public void dibujar(Rectangulo rec) {
        for (int i = 0; i < rec.getBase(); i++) {
            for (int j = 0; j < rec.getAltura(); j++) {
                if (j == rec.getAltura() - 1) {
                    System.out.println("*");
                } else if (i == 0 || i == rec.getBase() - 1) {
                    System.out.print("* ");
                } else if (j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
