/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
package Entidades;

public class Ejercicio4Rectangulo {

    private double base;
    private double altura;

    public Ejercicio4Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double perimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

    public double superficie() {
        double superficie = base * altura;
        return superficie;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void dibujar() {
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }

    }

}
