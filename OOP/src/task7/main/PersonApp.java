package task7.main;

import task7.persona.Persona;
import task7.servicio.ServicioPersona;

/**
 *
 * @author Felipe Sandim
 */
public class PersonApp {
    public static void main(String[] args) {
        ServicioPersona servicio = new ServicioPersona();

        Persona p1 = servicio.crearPersona();
        Persona p2 = servicio.crearPersona();
        Persona p3 = servicio.crearPersona();
        Persona p4 = servicio.crearPersona();

        int imc1 = servicio.calcularIMC(p1);
        boolean mayor1 = servicio.esMayorDeEdad(p1);

        int imc2 = servicio.calcularIMC(p2);
        boolean mayor2 = servicio.esMayorDeEdad(p2);

        int imc3 = servicio.calcularIMC(p3);
        boolean mayor3 = servicio.esMayorDeEdad(p3);

        int imc4 = servicio.calcularIMC(p4);
        boolean mayor4 = servicio.esMayorDeEdad(p4);

        porcentajesImc(imc1, imc2, imc3, imc4);
        porcentajesMayor(mayor1, mayor2, mayor3, mayor4);
    }
    
    private static void porcentajesImc(int imc1, int imc2, int imc3, int imc4) {
        int[] arr = new int[4];
        arr[0] = imc1;
        arr[1] = imc2;
        arr[2] = imc3;
        arr[3] = imc4;
        double[] contador = new double[3];
        
        for (int imc : arr) {
            if (imc < 0) {
                contador[0]++;
            } else if (imc == 0) {
                contador[1]++;
            } else {
                contador[2]++;
            }
        }
        
        double debajoPesoIdeal = (contador[0] / 4) * 100;
        double pesoIdeal = (contador[1] / 4) * 100;
        double sobrePeso = (contador[2] / 4) * 100;
        
        System.out.println(">> PORCENTAJE DE LAS 4 PERSONAS <<");
        System.out.println("Por debajo de su peso: " + debajoPesoIdeal + "%");
        System.out.println("En su peso ideal: " + pesoIdeal + "%");
        System.out.println("Con sobrepeso: " + sobrePeso + "%");
    }
    
    private static void porcentajesMayor(boolean mayor1, boolean mayor2, boolean mayor3, boolean mayor4) {
        boolean[] arr = new boolean[4];
        arr[0] = mayor1;
        arr[1] = mayor2;
        arr[2] = mayor3;
        arr[3] = mayor4;
        double[] contador = new double[2];
        
        for (boolean mayor : arr) {
            if (mayor == true) {
                contador[0]++;
            } else {
                contador[1]++;
            }
        }
        
        double mayorDeEdad = (contador[0] / 4) * 100;
        double menorDeEdad = (contador[1] / 4) * 100;
        
        System.out.println(">> PORCENTAJE DE LAS 4 PERSONAS <<");
        System.out.println("Mayores de edad: " + mayorDeEdad + "%");
        System.out.println("Menores de edad: " + menorDeEdad + "%");
    }
}
