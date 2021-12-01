/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
*/
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
        int x = 0;
        int y = 0;
        int contVecesIgual = 0;
        boolean encontrado = false;
        boolean salir = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int) (Math.random() * 100 + 1);

                if (M[i][j] > 9) {
                    System.out.print(M[i][j] + " ");
                } else {
                    System.out.print(M[i][j] + "  ");
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j] = leer.nextInt();
            }
        }
                
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (M[i][j] == P[0][0]){
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (P[k][l] == M[i+k][j+l]) {
                                contVecesIgual++;
                                
                            }
                        }
                    }
                }
                
            }
        }
        
        if (contVecesIgual == 9) {
            System.out.println("La matriz P se encuentra incluída en la matriz M en la posición [" + x + "," + y + "]");
        } else {
           System.out.println("La matriz P no se encuentra incluída en la matriz M");
        }  
             
        
        

    }
}
