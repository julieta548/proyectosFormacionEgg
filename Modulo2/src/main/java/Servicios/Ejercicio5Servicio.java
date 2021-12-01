package Servicios;

import Entidades.Ejercicio5Cuenta;
import java.util.Scanner;

public class Ejercicio5Servicio {

    public void menu() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese sus datos: número de cuenta, DNI, saldo e interés");
        Ejercicio5Cuenta usuario1 = new Ejercicio5Cuenta(leer.nextInt(), leer.nextLong(), leer.nextDouble(), leer.nextDouble());
        System.out.println("Elija qué desea hacer:");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extracción rápida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos");
        System.out.println("6. Salir");
        int opcion = leer.nextInt();

        do {
            switch (opcion) {
                case 1:
                    usuario1.ingreso(leer.nextDouble());
                    break;

                case 2:
                    usuario1.retiro(leer.nextDouble());
                    break;

                case 3:
                    usuario1.extraccionRapida(leer.nextDouble());
                    break;

                case 4:
                    usuario1.consultarSaldo();
                    break;

                case 5:
                    usuario1.consultarDatos();
                    break;
                 
                case 6: 
                    break; 

                default:
                    System.out.println("Opción incorrecta");
            }
        } while ((opcion < 1 || opcion > 6) || opcion != 6);

    }

}
