package task5.main;

import task5.cuenta.Cuenta;
import task5.servicio.serviceCuenta;

/**
 *
 * @author Felipe Sandim
 */
public class CuentaApp {
    public static void main(String[] args) {
        serviceCuenta service = new serviceCuenta();
        
        Cuenta cuenta1 = service.crearCuenta();
        
        service.consultarDatos(cuenta1);
        
        service.ingresar(5000, cuenta1);
        service.retirar(1500, cuenta1);
        service.extraccionRapida(cuenta1);
        
        service.consultarSaldo(cuenta1);
        service.consultarDatos(cuenta1);
    }
}
