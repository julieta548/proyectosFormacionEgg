
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio24 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int [] vector = new int[10000];
       int i, elemento, longitud;
       String aLetra;
       int cont5, cont4,cont3,cont2,cont1;
       cont1 = 0;
       cont2 = 0;
       cont3 = 0;
       cont4 = 0;
       cont5 = 0;
         
       for (i = 0; i < 10000; i++){
           vector[i] = (int) (Math.random()*(99999-0+1)+0);
           
           System.out.println(vector[i] + " ");
            elemento = vector[i];
            
            aLetra = String.valueOf(elemento);
            longitud = aLetra.length();
                    
            if (longitud == 5){
               cont5= cont5 + 1;
            } else if (longitud == 4){
               cont4= cont4 + 1;
            } else if (longitud == 3){
               cont3= cont3 + 1;
            } else if (longitud == 2){
                cont2= cont2 + 1;
            } else if (longitud == 1){
                cont1= cont1 + 1;
            }
       } 
        System.out.println("");
        System.out.println("1 dígito: " + cont1);
        System.out.println("2 dígitos: " + cont2);
        System.out.println("3 dígitos: " + cont3);
        System.out.println("4 dígitos: " + cont4);
        System.out.println("5 dígitos: " + cont5);
        
       
    }
        
}
