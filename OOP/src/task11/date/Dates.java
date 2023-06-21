package task11.date;

import java.util.Date;
import java.util.Scanner;
/**
 *instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
    se puede conseguir instanciando un objeto Date con constructor vacío.
 * @author Felipe Sandim
 */
public class Dates {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el año");
        int año = read.nextInt();
        System.out.println("Ingrese el mes");
        int mes = read.nextInt();
        System.out.println("Ingrese el día");
        int dia = read.nextInt();
        
        Date date1 = new Date(año - 1900, mes, dia);
        System.out.println(date1);
        
        Date dateActual = new Date();
        
        int diferenciaAños = Math.abs(date1.getYear() - dateActual.getYear());
        int diferenciaMes = Math.abs(date1.getMonth() - dateActual.getMonth());
        int diferenciaDia = Math.abs(date1.getDay() - dateActual.getDay());
        
        System.out.println("FECHA INGRESADA: " + date1);
        System.out.println("FECHA ACTUAL: " + dateActual);
        System.out.println(diferenciaAños + "año/s de diferencia");
        System.out.println(diferenciaMes + "mese/s de diferencia");
        System.out.println(diferenciaDia + "día/s de diferencia");
    }
}
