
package Servicios;

import Entidades.Entidadejercicio3;
import java.util.Scanner;

public class ServicioEjercicio3 {
    
    Scanner leer = new Scanner(System.in);
    
    public void Llenar(Entidadejercicio3 o){
        o.setNumero1(leer.nextDouble());
        o.setNumero2(leer.nextDouble());
    }
    
    public void Suma(Entidadejercicio3 o){
        double suma = o.getNumero1() + o.getNumero2();
        System.out.println(suma);
    }
}
