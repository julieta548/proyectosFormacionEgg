package Servicios;

import Entidades.Ejercicio6Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearJuego(Ejercicio6Ahorcado j) {
        System.out.println("Ingrese la palabra a adivinar");
        String p = leer.next();
        String[] palabra2 = new String[p.length()];
        
        for (int i = 0; i < p.length(); i++) {
            palabra2[i] = p.substring(i, i + 1);
        }
        
        j.setPalabra(palabra2);
        
        j.setJugadas(6);
        
        j.setEncontrado(0);
        
    }
    
    public void longitud(Ejercicio6Ahorcado j) {
        System.out.println("La palabra a adivinar tiene " + j.getPalabra().length + " letras");
    }
    
    public void buscarLetra(Ejercicio6Ahorcado j) {
        int contador = 0;
        do {
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            System.out.println("");
            
            for (int i = 0; i < j.getPalabra().length; i++) {
                if (j.getPalabra()[i].equals(letra)) {
                    contador++;
                    j.setEncontrado(contador);
                }
                
               
                
                if (i == j.getPalabra().length-1 && j.getEncontrado() > 0) {
                System.out.println("La letra " + letra + " se encuentra en la palabra");
                System.out.println("");
            } else {
                System.out.println("La letra " + letra + " no se encuentra en la palabra, tiene " + j.getJugadas() + " intentos restantes");
                System.out.println("");
            }
                
            }
            
            
            
        } while (j.getEncontrado() != j.getPalabra().length && j.getJugadas() > 0);
        
        if (j.getJugadas() == 0) {
            System.out.println("No quedan más intentos");
        }
        
        if (j.getEncontrado() == j.getPalabra().length) {
            System.out.println("¡Ha ganado!");
        }
        
    }
    
}
