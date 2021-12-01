
package Entidades;


public class Ejercicio8Cadena {
    private String frase;
    private int longitud; 
    
    public Ejercicio8Cadena(){
        
    }
    
    public Ejercicio8Cadena(String frase, int longitud){
        this.frase = frase; 
        this.longitud = longitud;
    }
  
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
}
