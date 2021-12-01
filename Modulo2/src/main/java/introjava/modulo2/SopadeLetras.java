package introjava.modulo2;

import java.util.Random;
import java.util.Scanner;

public class SopadeLetras {

    public static void main(String[] args) {

        todo();

    }

    public static void todo() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[] vPalabra = new String[5];
        String[][] sopa = new String[20][20];
        Random A = new Random();
        int longitud1 = 0;
        int longitud2 = 0;
        int longitud3 = 0;
        int longitud4 = 0;
        int longitud5 = 0;
        int p, q;

        System.out.println("Ingrese 5 palabras de 3 a 5 letras");
        for (int i = 0; i < 5; i++) {
            palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            while (palabra.length() > 5 || palabra.length() < 3){
                System.out.println("Incorrecto, vuelva a intentar");
                palabra = leer.nextLine();
                palabra = palabra.toUpperCase();
            }
            
            vPalabra[i] = palabra;
            switch (i) {
                case 0:
                    longitud1 = palabra.length();
                    break;
                case 1:
                    longitud2 = palabra.length();
                    break;
                case 2:
                    longitud3 = palabra.length();
                    break;
                case 3:
                    longitud4 = palabra.length();
                    break;
                case 4:
                    longitud5 = palabra.length();
                    break;
            }

            if (i == 4) {
                break;
            }
        }

        System.out.println("");
        System.out.println("¡A JUGAR!");
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "";
            }
        }

        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                p = A.nextInt(20);
                q = A.nextInt(20 - longitud1);

                for (int i = 0; i < longitud1; i++) {

                    sopa[p][q + i] = vPalabra[0].substring(i, i + 1);

                }
            } else if (k == 1) {
                do {
                    p = A.nextInt(20);
                    q = A.nextInt(20 - longitud2);
                } while (sopa[p][q] != "");

                for (int i = 0; i < longitud2; i++) {

                    sopa[p][q + i] = vPalabra[k].substring(i, i + 1);

                }
            } else if (k == 2) {
                do {
                    p = A.nextInt(20);
                    q = A.nextInt(20 - longitud3);
                } while (sopa[p][q] != "");

                for (int i = 0; i < longitud3; i++) {

                    sopa[p][q + i] = vPalabra[k].substring(i, i + 1);

                }
            } else if (k == 3) {
                do {
                    p = A.nextInt(20);
                    q = A.nextInt(20 - longitud4);
                } while (sopa[p][q] != "");

                for (int i = 0; i < longitud4; i++) {

                    sopa[p][q + i] = vPalabra[k].substring(i, i + 1);

                }
            } else if (k == 4) {
                do {
                    p = A.nextInt(20);
                    q = A.nextInt(20 - longitud5);
                } while (sopa[p][q] != "");

                for (int i = 0; i < longitud5; i++) {

                    sopa[p][q + i] = vPalabra[k].substring(i, i + 1);

                }
            }

        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == "") {
                    sopa[i][j] = String.valueOf(A.nextInt(10));
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
