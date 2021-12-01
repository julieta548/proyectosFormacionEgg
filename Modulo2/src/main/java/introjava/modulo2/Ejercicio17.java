
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio17 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
               
        int correctos = 0;
        int incorrectos = 0;  
        String cadena; 
        
        do {
            System.out.println("Ingrese secuencia");
            cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
            int longitud = cadena.length();
            
            if (cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O") && longitud == 5) {

                correctos = correctos + 1; 

            } else if (cadena.substring(0,1).equals("X") == false && cadena.substring(4,5).equals("O") == false && longitud == 5) {
                incorrectos = incorrectos + 1; 
            } else {
                incorrectos = incorrectos;
            }

        } while (cadena.equals("&&&&&") == false);
        
        System.out.println("Correctos: " + correctos + ", Incorrectos: " + incorrectos);
    }
    
}
