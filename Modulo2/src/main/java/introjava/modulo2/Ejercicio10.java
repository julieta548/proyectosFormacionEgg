
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio10 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.next();
        int longitudOk = 8;
        int longitud = frase.length();
        
        if (longitudOk == longitud) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto.");

        }


    }
    
}
