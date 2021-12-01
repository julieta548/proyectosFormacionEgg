
package Principal;

import Entidades.Ejercicio9Matematica;
import Servicios.MatematicaServicio;


public class Ejercicio9 {

    
    public static void main(String[] args) {
       
        MatematicaServicio operacion = new MatematicaServicio();
        Ejercicio9Matematica valores = new Ejercicio9Matematica();
        operacion.pedirNum(valores);
        operacion.devolverMayor(valores);
        operacion.potencia(valores);
        operacion.raiz(valores);
    }

}
