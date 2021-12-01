
package Principal;

import Entidades.Ejercicio4Rectangulo;
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base, luego altura");
        
        Ejercicio4Rectangulo rectangulo = new Ejercicio4Rectangulo(leer.nextDouble(), leer.nextDouble());
        
        System.out.println("Perímetro: " + rectangulo.perimetro() + ", Superficie: " + rectangulo.superficie());
        System.out.println("");
        rectangulo.dibujar();
        
    }

}
