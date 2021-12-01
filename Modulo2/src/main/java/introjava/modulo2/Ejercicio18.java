
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio18 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String cent = "";
       String dec = "";
       String uni = "";
       int i, j, k;
       
       for (i = 0; i < 10; i++) {
           cent = String.valueOf(i);
                if (i == 3){
                   cent = "E"; 
                    }
                
           for (j = 0; j < 10; j++) {
               dec = String.valueOf(j); 
                    if (j == 3){
                       dec = "E"; 
                    }
               
                for (k = 0; k < 10; k++) {
                   uni = String.valueOf(k);
                 
                   if (k == 3){
                       uni = "E"; 
                    }
                   
                   System.out.println(cent + "-" + dec + "-" + uni);
                }       
            }
       }  
    }
}
    

