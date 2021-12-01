
package Entidades;

public class Ejercicio1Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int numerodepaginas; 
    
    public Ejercicio1Libro() {

    }
    public Ejercicio1Libro(int isbn, String titulo, String autor, int numerodepaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
    }
    
    public int getIsbn() {
        return isbn;
    }

   
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

  
    public String getAutor() {
        return autor;
    }

    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public int getNumerodepaginas() {
        return numerodepaginas;
    }

   
    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }
            
}
