
package Principal;

import Entidades.Ejercicio10Arreglo;
import Servicios.ArregloServicio;


public class Ejercicio10 {

    
    public static void main(String[] args) {
       
        ArregloServicio service = new ArregloServicio();
        Ejercicio10Arreglo vectores = new Ejercicio10Arreglo();
        service.llenadoPrincipal(vectores);
        service.ordenar(vectores);
        service.llenadoSecundario(vectores);
    }

}
