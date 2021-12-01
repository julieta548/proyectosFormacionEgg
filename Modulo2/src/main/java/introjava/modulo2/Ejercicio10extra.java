
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio10extra {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         int num1 = (int) Math.random()*10+1;
         int num2 = (int) Math.random()*10+1;
         int resultado = num1 * num2;
         int respuesta;
         
         System.out.println("Adivine el resultado de la multiplicación entre dos números aleatorios del 1 al 10");
         respuesta = leer.nextInt();
         
         while (respuesta != resultado){
             System.out.println("Incorrecto, intente de nuevo");
             respuesta = leer.nextInt();
         }
         
         System.out.println("Correcto, la respuesta es " + resultado);
    }
    
}
