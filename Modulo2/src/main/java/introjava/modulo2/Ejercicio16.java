
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio16 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    double counter = 0;
    int counter2 = 0;
    int cant = 20;

    System.out.println("Ingrese 20 números, se capturará el 0 y se sumarán los números positivos");
    
        double eternidad = leer.nextDouble();
        while (eternidad != 0 && counter2 < 21) {
            counter2 = counter2 + 1;

            if (eternidad > 0) {
            counter = counter + eternidad;
            }

            eternidad = leer.nextDouble();
        }
    
        System.out.println("Se ha capturado el 0. La suma de los números positivos es de " + counter);
    }
}
