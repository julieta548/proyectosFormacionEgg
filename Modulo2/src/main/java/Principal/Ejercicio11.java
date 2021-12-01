package Principal;

import java.util.Date;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Date fecha1 = new Date();
        Date fechaActual = new Date();

        fecha1.setDate(leer.nextInt());
        fecha1.setMonth(leer.nextInt());
        fecha1.setYear(leer.nextInt());

        int diferencia = fechaActual.getYear() - fecha1.getYear();
        System.out.println("Diferencia: " + diferencia);

    }

}
