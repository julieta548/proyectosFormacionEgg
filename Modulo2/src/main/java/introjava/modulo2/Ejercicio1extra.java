
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio1extra {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int horas = 0;
        int minutos = leer.nextInt();
        horas = minutos/60;
        int cantHoras = 0;
        int dias = 0; 
        int resto = 0; 
        
        while (horas > 24) {
           
            horas = horas - 24;
            dias++;
            resto = horas;
        }
        
        
        
        System.out.println(dias + " dias y " + resto + " horas.");
        
        
    }
    
}
