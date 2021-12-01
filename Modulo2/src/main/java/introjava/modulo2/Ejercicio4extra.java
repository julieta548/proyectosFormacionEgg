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
public class Ejercicio4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número del 1 al 10");
        int num = leer.nextInt();
        
        while (num >10 || num<1){
            System.out.println("Número incorrecto, intente nuevamente");
            num = leer.nextInt();
        }
        
        switch (num) {
            case 1: System.out.println("1 = I");
            case 2: System.out.println("2 = II");
            case 3: System.out.println("3 = III");
            case 4: System.out.println("4 = IV");
            case 5: System.out.println("5 = V");
            case 6: System.out.println("6 = VI");
            case 7: System.out.println("7 = VII");
            case 8: System.out.println("8 = VIII");
            case 9: System.out.println("9 = IXI");
            case 10: System.out.println("10 = X");
        }
    }
    
}
