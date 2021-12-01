package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio8extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num; 
        int par = 0;
        int impar = 0;
        int cant = 0;
        
        System.out.println("Ingrese números enteros");
        do {
            num = leer.nextInt();
            cant++;
            
            if(num % 2 == 0){
                par++;
            }else {
                impar++;
            }
            
        }while (num % 5 != 0);
        
        System.out.println("Números pares: " + par + ", números impares: " + impar + ", cantidad de ingresos: " + cant);
    }
    
}
