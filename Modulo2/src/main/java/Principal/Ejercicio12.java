

package Principal;

import Entidades.Ejercicio12Persona;
import Servicios.PersonaServicio;


public class Ejercicio12 {

    
    public static void main(String[] args) {
       
     PersonaServicio nuevo = new PersonaServicio ();
     Ejercicio12Persona persona = new Ejercicio12Persona(); 
     nuevo.crearPersona(persona);
     nuevo.calcularEdad(persona); 
     nuevo.menorQue(persona);
     
    }

}
