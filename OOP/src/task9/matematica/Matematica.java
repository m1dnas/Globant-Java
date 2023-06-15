package task9.matematica;

/**
 *
 * @author Felipe Sandim
 */
public class Matematica {
    private double num1, num2;

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematica() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double devolverMayor(double num1, double num2) {
        return Math.max(num2, num1);
    }
    
    public double calcularPotencia(double num1, double num2) {
        double mayor =  Math.round(Math.max(num1, num2));
        double menor = Math.round(Math.min(num1, num2));
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz(double num1, double num2) {
        double menor = Math.abs(Math.min(num1, num2));
        return Math.sqrt(menor);
    }
}
