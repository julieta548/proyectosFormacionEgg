package Entidades;

import java.util.Scanner;

public class Ejercicio3Operacion {
    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;
    
    public Ejercicio3Operacion(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public Ejercicio3Operacion(){
        
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese numero 1:");
       this.numero1= leer.nextInt();
       System.out.println("Ingrese numero 2:");
       this.numero2= leer.nextInt();
    }
    
    public double sumar(){
        int suma=numero1 + numero2;
        return suma; 
    }
    
    public double restar(){
        int resta=numero1 - numero2;
        return resta; 
    }
    
    public double multiplicar(){
        int mult;
        if(numero1==0 || numero2==0){
            mult= 0;
            System.out.println("Error");
        } else {
            mult= numero1 * numero2;
        }
        return mult; 
    }
    
    public double dividir(){
        double div;
        if(numero2==0){
            div = 0;
            System.out.println("Error");
        } else {
            div= numero1 / numero2;
        }
        return div; 
    }
}
