/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
package Entidades;

import java.util.Scanner;

public class Ejercicio5Cuenta {

    Scanner leer = new Scanner(System.in);
    private int numeroCuenta;
    private long dni;
    private double saldo;
    private double interes; 

    public Ejercicio5Cuenta() {
    }

    public Ejercicio5Cuenta(int numeroCuenta, long dni, double saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double ingreso(double ingreso) {
        saldo = saldo + ingreso;
        return saldo;
    }

    public double retiro(double retiro) {
        if (retiro >= saldo) {
            saldo = saldo - retiro;
            return saldo;
        } else {
            saldo = 0;
            return saldo;
        }

    }

    public double extraccionRapida(double extraccionRapida) {
        System.out.println("Ingrese el monto a extraer");
        if (extraccionRapida >= saldo * 20 / 100) {
            System.out.println("Sólo puede retirar hasta el 20% de su saldo.");
            return saldo;
        } else {
            saldo = saldo - extraccionRapida;
            return saldo;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consultarDatos() {
        System.out.println("Ingrese 1 ó 2 para consultar:");
        System.out.println("1. Número de cuenta");
        System.out.println("2. DNI");
        int opcion = leer.nextInt();
        
        if (opcion  == 1) {
            System.out.println(numeroCuenta);
        } else if (opcion == 2) {
            System.out.println(dni);
        }
    }
}
