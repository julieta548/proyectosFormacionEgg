
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        
        System.out.println("Ingrese un número entero");
        Scanner leer = new Scanner(System.in);
        int dato = leer.nextInt();
        int operacion = dato*2;
        System.out.println("El doble del dato ingresado es " + operacion);
        operacion = dato*3;
        System.out.println("El triple del dato ingresado es " + operacion);
        System.out.println("La raíz cuadrada del dato ingresado es de " + Math.sqrt(dato));
    }
}
