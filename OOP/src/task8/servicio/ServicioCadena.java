package task8.servicio;

import java.util.Scanner;
import task8.cadena.Cadena;
/**
 *
 * @author Felipe Sandim
 */
public class ServicioCadena {
    Scanner read = new Scanner(System.in);
    
    public void mostrarVocales(Cadena cad) {
        String f = cad.getFrase();
        int contador = 0;
        
        for (int i = 0; i < f.length(); i++) {
            String ch = f.substring(i, i + 1).toLowerCase();
            if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
                contador++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador + " vocales");
    }
    
    public void invertirFrase(Cadena cad) {
        String f = cad.getFrase();
        String fInvertida = "";
        for (int i = f.length() - 1; i >= 0; i--) {
            fInvertida += f.charAt(i);
        }
        System.out.println("La frase invertida: " + fInvertida);
    }
    
    public void vecesRepetido(Cadena cad) {
        String f = cad.getFrase();
        int contador = 0;
        System.out.println("Ingrese una letra para contar cuantas veces está en la frase " + f);
        String letra = read.nextLine();
        
        for (int i = 0; i < f.length(); i++) {
            String ch = f.substring(i, i + 1);
            if (ch.equals(letra)) {
                contador++;
            }
        }
        System.out.println("La frase contiene la letra [" + letra + "] " + contador + " veces");
    }
    
    public void compararLongitud(Cadena cad) {
        System.out.println("Ingrese una nueva frase");
        String f = cad.getFrase();
        String f2 = read.nextLine();
        
        System.out.println("La longitud de la primer frase es: " + f.length());
        System.out.println("La longitud de la nueva frase es: " + f2.length());
    }
    
    public void unirFrases(Cadena cad) {
        System.out.println("Ingrese una nueva frase:");
        String f = cad.getFrase();
        String f2 = read.nextLine();
        
        System.out.println("La frase concatenada es: " + f.concat(f2));
    }
    
    public void reemplazar(Cadena cad) {
        System.out.println("Ingrese un carácter para reemplazar por las \"a\":");
        String f = cad.getFrase();
        String f2 = read.nextLine();
        
        System.out.println("Frase resultante:" + f.replace("a", f2));
    }
    
    public void contiene(Cadena cad) {
        System.out.println("Ingrese un carácter para comprobar si la frase la contiene");
        String f = cad.getFrase();
        String f2 = read.nextLine();
        
        if (f.contains(f2)) {
            System.out.println("La contiene");
        } else {
            System.out.println("No la contiene");
        }
    }
}