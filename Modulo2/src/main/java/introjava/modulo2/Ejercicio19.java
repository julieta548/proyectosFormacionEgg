
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio19 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String espacio = " ";
        String asterisco = "*";
        String superior = "";
        String lado = "";
        int i, j;
        System.out.println("Ingrese el tamaño del cuadrado");
        int t = leer.nextInt();
        
        for (i = 0; i < t; i++){
            superior = superior.concat("*");
            if (i != t-2){
                asterisco = asterisco.concat(" ");
            } else if (i == t-2) {
                asterisco = asterisco.concat("*");
            }

        }
        
        System.out.println(superior);
        
        for (i = 0; i < t - 2; i++ ){
        System.out.println(asterisco);
        }
        
        System.out.println(superior);
    }    
}
    
