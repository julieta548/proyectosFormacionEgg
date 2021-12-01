package Entidades;

public class Ejercicio6Ahorcado {

    private String[] palabra;
    private int encontrado;
    private int jugadas;

    public Ejercicio6Ahorcado() {

    }

    public Ejercicio6Ahorcado(String[] palabra, int encontrado, int jugadas) {
        this.palabra = palabra;
        this.encontrado = encontrado;
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontrado() {
        return encontrado;
    }

    public void setEncontrado(int encontrado) {
        this.encontrado = encontrado;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

   

}
