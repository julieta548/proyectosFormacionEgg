
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingrese un número entero positivo");
            int num1 = leer.nextInt();
            while(num1 < 0){
                System.out.println("Dato incorrecto, intente nuevamente");
                num1 = leer.nextInt();
            } 
              
      System.out.println("Ingrese otro número entero positivo");
             int num2 = leer.nextInt();
              while(num2 < 0){
                  System.out.println("Dato incorrecto, intente nuevamente");
                  num2 = leer.nextInt();
              }
              
      int suma = num1 + num2;
      System.out.println("La suma de ambos números es "+suma); 
      
      
    }
    
}
