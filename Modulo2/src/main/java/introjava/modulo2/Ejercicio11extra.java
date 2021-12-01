
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio11extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        int digitos = 0;
        
        do{
            if(num > 9 ){
                num = num/10;
                digitos++;
            }
        } while(num >= 10);
        
        digitos = digitos + 1; 
        
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
    
}
