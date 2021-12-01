package Servicios;

import Entidades.Ejercicio9Matematica;
import java.util.Scanner;

public class MatematicaServicio {

    Scanner leer = new Scanner(System.in);

    public void pedirNum(Ejercicio9Matematica op) {
        op.setNum1(Math.random() * 10 + 1);
        op.setNum2(Math.random() * 10 + 1);
        System.out.println("Número 1: " + op.getNum1());
        System.out.println("Número 2: " + op.getNum2());
        
    }

    public void devolverMayor(Ejercicio9Matematica op) {
        System.out.println("El número mayor es " + Math.max(op.getNum1(), op.getNum2()));

    }

    public void potencia(Ejercicio9Matematica op) {
        double n1 = Math.round(op.getNum1());
        double n2 = Math.round(op.getNum2());

        System.out.println(Math.max(n1, n2) + " elevado a la " + Math.min(n1, n2) + " es igual a " + Math.pow(n1, n2));
    }
    
    public void raiz(Ejercicio9Matematica op){
        double n1 = Math.abs(op.getNum1());
        double n2 = Math.abs(op.getNum2());
        double min = Math.min(n1, n2);
        System.out.println("La raiz cuadrada de " + min + " es igual a " + Math.sqrt(min));
    }

}
