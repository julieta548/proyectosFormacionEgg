package Servicios;

import Entidades.Ejercicio12Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date fechaActual = new Date();

    public void crearPersona(Ejercicio12Persona p) {
        System.out.println("Ingrese nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese día de nacimiento");
        p.getNacimiento().setDate(leer.nextInt());
        System.out.println("Ingrese mes de nacimiento");
        p.getNacimiento().setMonth(leer.nextInt());
        System.out.println("Ingrese año de nacimiento (últimos dos dígitos)");
        p.getNacimiento().setYear(leer.nextInt());
        
        System.out.println(p.getNombre() + ", " + p.getNacimiento());
    }

    public int calcularEdad(Ejercicio12Persona p) {
        int edad = fechaActual.getYear() - p.getNacimiento().getYear();
        System.out.println("Su edad es :" + edad);
        
        return edad;
    }

    public void menorQue(Ejercicio12Persona p) {
        int edad2 = leer.nextInt();
        int edad = fechaActual.getYear() - p.getNacimiento().getYear();
        boolean bool = false;
        if (edad < edad2) {
            bool = true;
        } else {
            bool = false;
        }
        
        System.out.println("¿La edad ingresada es mayor que la inicial? : " + bool);

    }

}
