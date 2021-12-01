
package Entidades;

public class Ejercicio2Circunferencia {
    private double radio;
    
    public Ejercicio2Circunferencia(double radio) {
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio=radio;
    }
    
    public double Area(){
       double area = Math.PI * (radio*radio);
       return area;
    }
    
    public double Perimetro(){
       double perimetro = 2*Math.PI*radio;
       return perimetro;
    }
    
    
    
}
