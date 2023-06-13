package task5.cuenta;

/**
 *
 * @author Felipe Sandim
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private long dni;
    
    public Cuenta() {
    }
    
    public Cuenta(int numeroCuenta, int saldo, long dni) {
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}
