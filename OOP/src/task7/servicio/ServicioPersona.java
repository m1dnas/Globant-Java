package task7.servicio;

import java.util.Scanner;
import task7.persona.Persona;

/**
 *
 * @author Felipe Sandim
 */
public class ServicioPersona {
    Scanner read = new Scanner(System.in);
    
    public Persona crearPersona() {
        char sexo;
        
        System.out.println("Ingrese su nombre");
        String nombre = read.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(read.nextLine());
        
        System.out.println("Ingrese su peso");
        int peso = Integer.parseInt(read.nextLine());
        
        System.out.println("Ingrese su altura");
        double altura = Double.parseDouble(read.nextLine());
        
        do {
            System.out.println("Ingrese su sexo (H, M o O)");
            sexo = Character.toUpperCase(read.nextLine().charAt(0));
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        
        return new Persona(nombre, edad, peso, altura, sexo);
    }
    
    public int calcularIMC(Persona person) {
        double imc = person.getPeso() / (person.getAltura() * person.getAltura());
        
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona person) {
        if (person.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
