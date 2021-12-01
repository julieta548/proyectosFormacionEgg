
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        String frase1;
        
        System.out.println("Ingrese una frase");
        frase1 = frase.next();
        
       
        System.out.println("Minúscula: "+frase1.toLowerCase());
        System.out.println("Mayúscula: "+frase1.toUpperCase());
       
    }
}
