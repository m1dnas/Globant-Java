package task5.servicio;

import java.util.Scanner;
import task5.cuenta.Cuenta;
/**
 *
 * @author Felipe Sandim
 */
public class serviceCuenta {
    Scanner read = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        System.out.println("Ingrese su DNI");
        long dni = read.nextLong();
        System.out.println("Ingrese su número de cuenta");
        int numCuenta = read.nextInt();
        System.out.println("Ingrese su saldo actual");
        int saldo = read.nextInt();
        
        return new Cuenta(numCuenta, saldo, dni);
    }
    
    public void ingresar(double ingreso, Cuenta cuenta) {
        double saldo = cuenta.getSaldo();
        saldo += ingreso;
        cuenta.setSaldo(saldo);
    }
    
    public void retirar(double retiro, Cuenta cuenta) {
        if (retiro > cuenta.getSaldo()) {
            cuenta.setSaldo(0);
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        }
    }
    
    public void extraccionRapida(Cuenta cuenta) {
        double saldo = cuenta.getSaldo();
        double extraccion = saldo * 0.2;
        
        if (extraccion < saldo && saldo > 0) {
            saldo -= extraccion;
            cuenta.setSaldo(saldo);
        } else {
            System.out.println("No se pudo realizar la extracción");
        }
    } 
    
    public double consultarSaldo(Cuenta cuenta) {
        return cuenta.getSaldo();
    }
    
    public void consultarDatos(Cuenta cuenta) {
        System.out.println("DNI: " + cuenta.getDni());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
