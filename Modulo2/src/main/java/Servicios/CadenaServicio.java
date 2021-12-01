package Servicios;

import Entidades.Ejercicio8Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public void ingresarFrase(Ejercicio8Cadena f) {
        System.out.println("Ingrese una palabra o frase");
        String frase = leer.next();
        f.setFrase(frase.toLowerCase());
    }

    public void calcularLongitud(Ejercicio8Cadena f) {
        f.setLongitud(f.getFrase().length());

    }

    public void contarVocales(Ejercicio8Cadena f) {
        int cont = 0;
        for (int i = 0; i < f.getLongitud(); i++) {
            String letra = f.getFrase().substring(i, i + 1);
            if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                cont++;
            }
        }
        System.out.println("Cantidad de vocales en la palabra o frase: " + cont);
    }

    public void invertirFrase(Ejercicio8Cadena f) {
        System.out.println("Frase invertida");
        StringBuilder sb = new StringBuilder(f.getFrase());
        System.out.println(sb.reverse());
    }

    public void vecesRepetido(Ejercicio8Cadena f) {
        System.out.println("Ingrese una letra y verifique cuántas veces está repetida");
        String letra = leer.next();
        String[] vectorRepetido = new String[f.getLongitud()];
        int contador = 0;

        for (int i = 0; i < f.getLongitud(); i++) {
            vectorRepetido[i] = f.getFrase().substring(i, i + 1);
            if (vectorRepetido[i].equals(letra)) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " está " + contador + " veces repetida.");

    }

    public void comparar(Ejercicio8Cadena f) {
        System.out.println("Ingrese una nueva palabra o frase y compare su longitud");
        String frase = leer.next();
        if (f.getFrase().length() == frase.length()) {
            System.out.println("La frase tiene la misma longitud que la última ingresada");
        } else if (f.getFrase().length() > frase.length()) {
            System.out.println("La última frase ingresada tiene menor longitud que la inicial");
        } else {
            System.out.println("La última frase ingresada tiene mayor longitud que la inicial");
        }
    }
    
    public void unirFrase(Ejercicio8Cadena f){
        System.out.println("Ingrese una frase a concatenar");
        String frase = leer.next();
        System.out.println(f.getFrase().concat(frase));
    }
    
    public void reemplazarLetra(Ejercicio8Cadena f){
        System.out.println("Ingrese una letra que reemplazará a las letras 'a'");
        String letra = leer.next();
        System.out.println(f.getFrase().replace("a",letra));
    }
    
    public void contieneString(Ejercicio8Cadena f){
        System.out.println("Ingrese una letra y verifique si está contenida en la frase ingresada");
        String letra = leer.next();
        System.out.println("¿Contiene la letra ingresada?: " + f.getFrase().contentEquals(letra));
    }
}
