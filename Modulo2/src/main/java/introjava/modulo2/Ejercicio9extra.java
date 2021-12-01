
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio9extra {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos números mayores a 1");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int cont = 0;
        
        while (num1 < 1 && num2 < 1){
            System.out.println("intente de nuevo");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        }
    
        do{
           num1 = num1 - num2;
           cont++;
        } while (num1 > num2);
        
        System.out.println("Cociente: " + cont + ", Resto: " + num1);
    }
    
}
