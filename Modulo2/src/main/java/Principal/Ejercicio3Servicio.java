
package Principal;

import Entidades.Entidadejercicio3;
import Servicios.ServicioEjercicio3;


public class Ejercicio3Servicio {

    
    public static void main(String[] args) {
       
        ServicioEjercicio3 mecanica = new ServicioEjercicio3();
        Entidadejercicio3 operacion = new Entidadejercicio3();
        
        mecanica.Llenar(operacion);
        mecanica.Suma(operacion);
        
    }

}
