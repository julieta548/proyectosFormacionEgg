package introjava.modulo2;

import java.util.Scanner;

public class Ultimoextra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();

        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 2] + vector[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }

    }
}
