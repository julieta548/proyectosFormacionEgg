
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio7extra {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de números que va a ingresar");
        int cant = leer.nextInt();
        int max = 0;
        int min = 0;
        int[] vector = new int[cant];
        boolean bool = false; 
        int promedio = 0;
        
        System.out.println("Ingrese números mayores de 0");
        for (int i = 0; i < cant - 1; i++) {
            vector[i] = leer.nextInt();
            promedio = promedio + vector[i];
            
            if(vector[i] < 0 ){
                System.out.println("Número incorrecto, intente de nuevo");
                vector[i]=leer.nextInt();
            }
            if (bool == false){
                max = vector[i];
                min = vector[i];
                bool = true;
            }    
            
            if(vector[i] > max){
                max = vector[i];
            } else {
                min = vector[i];
            }
            
        }
        promedio = promedio/cant;
        System.out.println("El número máximo es " + max + ", el mínimo es " + min + " y el promedio de todos ellos es " + promedio);
    }
    
}
