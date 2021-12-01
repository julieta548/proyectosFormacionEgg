package Servicios;

import Entidades.Ejercicio10Arreglo;
import java.util.Arrays;

public class ArregloServicio {

    public void llenadoPrincipal(Ejercicio10Arreglo v) {
        System.out.println("Arreglo A");
        for (int i = 0; i < 50; i++) {
            v.getA()[i] = Math.random() * 10 + 1;
            System.out.print(v.getA()[i]);
        }

        System.out.println("");

        System.out.println("Arreglo B");
        for (int i = 0; i < 20; i++) {
            v.getB()[i] = Math.random() * 10 + 1;
            System.out.print(v.getB()[i]);
        }
    }

    public void ordenar(Ejercicio10Arreglo v) {
        System.out.println("");
        System.out.println("Ordenado");
        Arrays.parallelSort(v.getA());
        for (int i = 0; i < 50; i++) {
            System.out.print(v.getA()[i]);
        }

    }

    public double [] llenadoSecundario(Ejercicio10Arreglo v) {
        System.out.println("");
        System.out.println("Llenado Secundario");

       
        Arrays.fill(v.getB(), 0.5);
        System.arraycopy(v.getA(), 0, v.getB(), 0, 10);
        

        for (int i = 0; i < 20; i++) {
            System.out.print(v.getB()[i]);
        }
        return v.getB();
    }

}
