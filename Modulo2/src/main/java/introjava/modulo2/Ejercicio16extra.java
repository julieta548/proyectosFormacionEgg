

package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio16extra {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
       int num = leer.nextInt();
       
       primoOno(num);
    }
    
    public static void primoOno(int num){
        int cont = 0;
        boolean primo = true; 
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0 && primo == true){
                cont++;
                if (cont > 1) {
                    primo = false;
                }
            }
        }
        System.out.println(primo);
    }
}
