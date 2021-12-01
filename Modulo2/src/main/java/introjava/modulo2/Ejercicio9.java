
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase1 = "eureka";
       
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        frase = frase.toLowerCase();
        
        if (frase1.equals(frase)) {
        System.out.println("Correcto!");
    } else {
        System.out.println("Incorrecto");
        } 
    
    }
  }
