
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio12extra {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int escalones = leer.nextInt();
       String escalon = "";
       String valor = "";
        int cont = 0;
        
        for (int i = 0; i < escalones; i++) {
            cont = cont + 1;
            valor = Integer.toString(cont);
            escalon = escalon.concat(valor);
            System.out.println(escalon);
        }
    }
    
}
