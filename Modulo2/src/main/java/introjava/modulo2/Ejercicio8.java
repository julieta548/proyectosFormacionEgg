
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double numero = leer.nextInt();
        if (numero % 2 == 0 && numero != 0) {
        System.out.println("El número es par");
        
        }else if (numero == 0) {
            System.out.println("El número no es par ni impar");
       } else {
              System.out.println("El número es impar");
        }
    }
    
}
