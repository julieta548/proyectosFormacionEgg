
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio6extra {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese cantidad de personas");
       int cant = leer.nextInt();
       double[] vector = new double[cant];
       double suma = 0;
       double suma1 = 0;
       int cont =0;
       double promedio = 0;
       double promedio1= 0;
       
        for (int i = 0; i < cant; i++) {
            System.out.println("Estatura:");
            vector[i] = leer.nextDouble();
        }
        
        for (int i = 0; i < cant; i++) {
            suma1= suma1 + vector[i];
            
            if (vector[i] < 1.60) {
                suma = suma + vector[i];
                cont++;
            }

            promedio = suma/cont;
            promedio1 = suma1/cant;
     
        }
         System.out.println("El promedio de las estaturas menores a 1,60 es de " + promedio + " y el promedio del total de las estaturas es de " + promedio1);
    }
}
