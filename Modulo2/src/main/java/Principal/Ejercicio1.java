package Principal;

import Entidades.Ejercicio1Libro;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Ejercicio1Libro l1 = new Ejercicio1Libro();
        Ejercicio1Libro [] libros = new Ejercicio1Libro [10];
        
        for (int i=0;i<10;i++){
            int isbn = leer.nextInt();
            String titulo = leer.next();
            String autor = leer.next();
            int numerodepaginas = leer.nextInt();
            
            Ejercicio1Libro libro = new Ejercicio1Libro (isbn,titulo,autor,numerodepaginas);
            libros[i] = libro;
        }

        System.out.println(l1.getTitulo() + "-" + l1.getAutor() + "-" + l1.getIsbn() + "-" + l1.getNumerodepaginas() + " páginas.");

    }

}
