
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = Math.max(num1,num2);
        System.out.println("El valor máximo ingresado es " + num3);
    
    }
    
}
