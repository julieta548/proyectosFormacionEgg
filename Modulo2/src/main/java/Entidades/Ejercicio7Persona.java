/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.

 */
package Entidades;

import java.util.Scanner;

public class Ejercicio7Persona {

    private Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Ejercicio7Persona() {

    }

    public Ejercicio7Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.println("Ingresar nombre");
        this.nombre = leer.next();
        System.out.println("Ingresar edad");
        this.edad = leer.nextInt();
        
        System.out.println("Ingresar sexo (M (Mujer), H(Hombre) u O(Otro))");
        do {
            this.sexo = leer.next();
            sexo = sexo.toUpperCase();
            if (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O")) {
                System.out.println("Vuelva a intentar");
            }
        } while (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O"));
        
        System.out.println("Ingresar altura en metros");
        this.altura = leer.nextDouble();
        
        System.out.println("Ingresar peso");
        this.peso = leer.nextDouble();

    }
    
    public int calcularIMC(){
        int valor = 0;
        double IMC = peso / (altura * altura);
        if (IMC < 20) {
            valor = -1; 
            System.out.println("Desnutrición");
        } else if (IMC >= 20 && IMC <= 25) {
            valor = 0;
            System.out.println("Bajo peso");
        } else if (IMC > 25) {
            valor = 1;
            System.out.println("Sobrepeso");
        }
        return valor; 
         
    }
    
    public boolean esMayordeEdad(){
        boolean booleano= false;
        System.out.println("¿Es mayor de edad?");
        if (edad >= 18) {
            booleano = true;
            System.out.println(booleano);
        } else if (edad < 18){
            booleano = false;
            System.out.println(booleano);
        }
        
        return booleano;
    }

    @Override
    public String toString() {
        return "Ejercicio7Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    

}
