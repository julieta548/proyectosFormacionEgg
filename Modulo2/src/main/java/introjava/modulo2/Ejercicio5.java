
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese una cantidad de grados Celsius");
        
        Scanner leer = new Scanner(System.in);
        double gradosC = leer.nextDouble();
        double ResultF;
                
        ResultF = 32 + (9 * gradosC / 5);
         
        System.out.println(gradosC + "°C equivalen a " + ResultF + "°F.");
   
    
}
    
}
