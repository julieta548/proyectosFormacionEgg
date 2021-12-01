
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio3extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int longitud; 
        String ingreso; 
        do {
            System.out.println("Ingrese una letra");
            ingreso = leer.nextLine();
            ingreso = ingreso.toUpperCase();
            longitud = ingreso.length();
        } while (longitud > 1);
        
        switch (ingreso) {
            case "A": System.out.println("Es una vocal");
            break; 
            case "E": System.out.println("Es una vocal");
            break;
            case "I": System.out.println("Es una vocal");
            break;
            case "O": System.out.println("Es una vocal"); 
            break;
            case "U": System.out.println("Es una vocal");
            break;
            default: System.out.println("No es una vocal");
        }
    }
    
}
