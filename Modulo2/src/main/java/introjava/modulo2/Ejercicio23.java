
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio23 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int [] vector = new int[100];
       int i, num;
       int cont = 0;
       
       System.out.println("Elija un número del 1 al 100");
       num = leer.nextInt();
        
       for (i = 0; i < 100; i++){
           vector [i] = (int)(Math.random()*100);
           System.out.print(vector[i] + " ");
       }
  
        System.out.println("");
        
       for (i = 0; i < 100; i++){
            if (vector[i] == num) {
                i = i+1;
                cont = cont + 1;
                System.out.println("El número se encuentra en la posición " + i);
            }
       }
       if (cont != 0) {
        System.out.println("El número está " + cont + " veces repetido.");
        
       } else if (cont == 1){
        System.out.println("El número está " + cont + " vez repetido.");   
       } else {
        System.out.println("El número no está en el vector.");
       }
    }
    
            
}
