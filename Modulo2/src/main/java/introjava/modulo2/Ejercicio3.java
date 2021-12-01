
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Por favor, ingrese su nombre");
        
        Scanner leer = new Scanner (System.in);
        
        String nombre = leer.next();
        
        System.out.println("Su nombre es "+nombre);
    
    }
    
}
