package Entidades;

import java.util.Date;

public class Ejercicio12Persona {
    
    private String nombre;
    private Date nacimiento;
    
    public Ejercicio12Persona(){
    
    }

    public Ejercicio12Persona(String nombre, Date nacimiento){
        this.nombre = nombre; 
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

}
