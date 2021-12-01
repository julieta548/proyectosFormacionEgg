/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.modulo2;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ejercicio5extra {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese tipo de socio: A, B o C");
        String tipo = leer.nextLine();
        tipo = tipo.toUpperCase();
        
        System.out.println("Ingrese el monto del tratamiento");
        double num = leer.nextInt();
        
        switch (tipo) {
            case "A": 
                num = num - num*50/100;
                System.out.println("El importe a pagar con el 50% de descuento es de " + num );
                break;
            case "B": 
                num = num - num*35/100;
                System.out.println("El importe a pagar con el 35% de descuento es de " + num );
                break;
            case "C": 
                System.out.println("Usted no posee descuento, el importe a pagar es de " + num );
        }
    }
    
}
