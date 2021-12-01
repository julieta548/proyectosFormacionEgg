
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio14 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        double limite = leer.nextDouble();
        
        double num, counter;
        counter = 0;
        do {
            System.out.println("Ingrese números, el sistema se detendrá cuando la suma entre ellos sea mayor al ingresado inicialmente.");
            num = leer.nextDouble();
            counter = counter + num;

           } while (counter < limite);
        
        System.out.println("La suma es " + counter + " y ha superado a " + limite);
    }
        
    
}
