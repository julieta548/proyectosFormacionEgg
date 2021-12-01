/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
              
        System.out.println("Ingrese una frase o palabra que comience con A");
        String frase = leer.next();
        frase = frase.toUpperCase();
        
        String letraA= "A";
        
        String primerLetra = frase.substring(0,1);
        
        if (primerLetra.equals(letraA) == true) {
            
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
               
        
    }
    
}
