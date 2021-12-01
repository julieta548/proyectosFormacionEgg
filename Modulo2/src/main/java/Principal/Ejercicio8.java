package Principal;

import Entidades.Ejercicio8Cadena;
import Servicios.CadenaServicio;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        CadenaServicio nuevo = new CadenaServicio();
        Ejercicio8Cadena f1 = new Ejercicio8Cadena();
        nuevo.ingresarFrase(f1);
        nuevo.calcularLongitud(f1);
        nuevo.contarVocales(f1);
        nuevo.invertirFrase(f1);
        nuevo.vecesRepetido(f1);
        nuevo.comparar(f1);
        nuevo.unirFrase(f1);
        nuevo.reemplazarLetra(f1);
        nuevo.contieneString(f1);

    }

}
