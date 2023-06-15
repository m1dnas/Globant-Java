package task8.main;

import java.util.Scanner;
import task8.cadena.Cadena;
import task8.servicio.ServicioCadena;
/**
 *
 * @author Felipe Sandim
 */
public class CadenaApp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra");
        String frase = read.nextLine();
        
        Cadena cadena1 = new Cadena();
        cadena1.setFrase(frase);
        cadena1.setLongitud(frase.length());
        
        ServicioCadena service = new ServicioCadena();
        service.mostrarVocales(cadena1);
        service.invertirFrase(cadena1);
        service.vecesRepetido(cadena1);
        service.compararLongitud(cadena1);
        service.unirFrases(cadena1);
        service.reemplazar(cadena1);
        service.contiene(cadena1);
    }
}
