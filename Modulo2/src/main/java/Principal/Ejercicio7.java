package Principal;

import Entidades.Ejercicio7Persona;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio7Persona[] Personas = new Ejercicio7Persona[4];
        int[] IMC = new int[4];
        boolean[] MdE = new boolean[4];
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int contA = 0;
        int contB = 0;

        for (int i = 0; i < 4; i++) {
            Personas[i] = new Ejercicio7Persona();
            Ejercicio7Persona persona = new Ejercicio7Persona();
            Personas[i].crearPersona();
            IMC[i] = persona.calcularIMC();
             if (IMC[i] == -1) {

                counterA++;
            } else if (IMC[i] == 0) {

                counterB++;
            } else {

                counterC++;
            }
             
            MdE[i] = persona.esMayordeEdad();
             if (MdE[i] == false) {
                 contA++;
               
            } else {
                 contB++;
             }
            
            System.out.print("[" + Personas[i] + "]");
            System.out.println("");

        }

        System.out.println("Personas con bajo peso: " + counterA + ", Personas con peso ideal: " + counterB + ", Personas con sobrepeso: " + counterC);
        System.out.println("Personas mayores de edad: " + contB + ", personas menores de edad: " + contA );
 
    }
}
