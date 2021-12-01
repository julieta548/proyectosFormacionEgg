
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num = 0;
        String asteriscos = "";
        System.out.println("Ingrese un número del 1 al 20. Ingrese 00 para terminar.");
        
        do {
            num = leer.nextInt();

            while ((num < 0 || num > 20) & num != 00) {
                System.out.println("Dato erróneo, intente nuevamente");
                num = leer.nextInt();
            }
            
            for (int i = 0; i < num; i++){
                asteriscos = asteriscos.concat("*");
            }
            
            System.out.println(num + "=" + asteriscos);
            asteriscos = "";
            
        } while(num >=0 & num <= 21 & num != 00);
    }
  
}
