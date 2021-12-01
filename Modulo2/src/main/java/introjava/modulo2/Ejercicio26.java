package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la matriz");
        int t = leer.nextInt();
        int i, j;
        int[][] matriz = new int[t][t];
        int[][] matriz1 = new int[t][t];
        int cont = 0;

        System.out.println("Matriz");
        for (i = 0; i < t; i++) {
            for (j = 0; j < t; j++) {
                System.out.println("Ingrese el siguiente número.");
                matriz[i][j] = leer.nextInt();
            }
        }

        for (i = 0; i < t; i++) {
            for (j = 0; j < t; j++) {
                if (matriz[i][j] > 9) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("Matriz 2");

        for (i = 0; i < t; i++) {
            for (j = 0; j < t; j++) {
                matriz1[i][j] = matriz[j][i] * (-1);
                if (matriz1[i][j] > 9) {
                    System.out.print(matriz1[i][j] + " ");
                } else {
                    System.out.print(matriz1[i][j] + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println(" ");

        boolean esIgual = true;

        for (i = 0; i < t; i++) {
            for (j = 0; j < t; j++) {
                if (matriz1[i][j] != matriz[i][j]) {
                    esIgual = false;
                }

            }
        }

        if (esIgual) {
            System.out.println("La segunda matriz es anti simétrica");
        } else {
            System.out.println("La segunda matriz no es anti simétrica");
        }
        
    }
    
}