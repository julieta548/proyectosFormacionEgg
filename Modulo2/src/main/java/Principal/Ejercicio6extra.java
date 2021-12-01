package Principal;

import Entidades.Ejercicio6Ahorcado;
import Servicios.AhorcadoServicio;


public class Ejercicio6extra {

    
    public static void main(String[] args) {
       
        AhorcadoServicio mecanica = new AhorcadoServicio();
        Ejercicio6Ahorcado ahorcado = new Ejercicio6Ahorcado();
        
        mecanica.crearJuego(ahorcado);
        mecanica.longitud(ahorcado);
        mecanica.buscarLetra(ahorcado);
    }

}
