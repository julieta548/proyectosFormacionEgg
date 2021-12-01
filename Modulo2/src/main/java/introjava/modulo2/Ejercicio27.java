/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
*/
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio27 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        int t = 3;
        int [][] matrizMagica = new int [t][t];
        int sumaD1 = 0;
        int sumaD2=0;
        int sumaF=0;
        int sumaC=0;
        
        
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                
                //llenado de matriz
                System.out.println("Ingrese valores de la matriz del 1 al 9");
                matrizMagica[i][j] = leer.nextInt();
                

                //límite 1 al 9
                while (matrizMagica[i][j] < 1 || matrizMagica[i][j] > 9) {
                    System.out.println("Del 1 al 9. Ingrese nuevamente");
                    matrizMagica[i][j] = leer.nextInt();
                }
                
                //suma filas
                sumaF = sumaF + matrizMagica[i][j]; 
                
                //suma columnas
                if (i == t-1 && j == t-1) {
                    for (int k = 0; k < t; k++) {
                        for (int l = 0; l < t; l++) {
                        sumaC = sumaC + matrizMagica[l][k];
                        }
                    }
                }
                
                             
                //impresión de la matriz
                System.out.print(matrizMagica[i][j] + " ");
            }
            System.out.println("");
            
            //suma diagonales
                sumaD1 = sumaD1 + matrizMagica[i][i];
                sumaD2 = sumaD2 + matrizMagica[i][(t-1)-i];
                
        }
        
        sumaF=sumaF/t;
        sumaC=sumaC/t;
        sumaD1=sumaD1;
        sumaD2=sumaD2;
        
        if (sumaF == sumaC && sumaF == sumaD1 && sumaF == sumaD2 && sumaC == sumaD1 && sumaC == sumaD2 && sumaD1 == sumaD2) {
            System.out.println("La matriz es mágica"); 
        } else {
            System.out.println("La matriz no es mágica");
        }
               
    }
    
}
