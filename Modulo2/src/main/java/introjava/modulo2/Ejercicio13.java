
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un número entre el 0 y el 10");
        Scanner leer = new Scanner(System.in);
        double num = leer.nextDouble();
        
        while (num < 0 || num > 10){
            System.out.println("Número incorrecto, intente nuevamente");
            num = leer.nextDouble();
        }
        
        System.out.println("Correcto!");
    }
    
}
