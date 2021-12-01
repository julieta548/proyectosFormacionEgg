/*El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package introjava.modulo2;

import java.util.Scanner;


public class Ejercicio21 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double cant;
        String moneda; 
       
        System.out.println("Ingrese el tipo de moneda que desea convertir: Libras (L), Dólares (D), Yenes (Y)");
        moneda = leer.nextLine();
        moneda = moneda.toUpperCase();
        System.out.println("Ingrese la cantidad");
        cant = leer.nextInt();
        
        cambio(cant, moneda);
    }
    
    public static void cambio(double cant, String moneda) {
        double exchange = 0;
        if (moneda.equals("L")){
            exchange = cant * 0.86;
            System.out.println("La conversión es de " + cant + " " + "Libras" + " es de " + exchange + " Euros.");
        } else if (moneda.equals("D")){
            exchange = cant * 1.28611;
            System.out.println("La conversión es de " + cant + " " + "Dólares" + " es de " + exchange + " Euros.");
        } else if (moneda.equals("Y")) {
            exchange = cant * 129.862;
            System.out.println("La conversión es de " + cant + " " + "Yenes" + " es de " + exchange + " Euros.");
        } else {
            System.out.println("Datos incorrectos");
        }
        
        
    }
    
}

    