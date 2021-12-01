package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
              
        System.out.println("Ingrese tipo de bomba del 1 al 4");
                int tipo = leer.nextInt();
                
        switch (tipo){
            case 1: System.out.println("La bomba es una bomba de agua"); 
                    break;
            
            case 2: System.out.println("La bomba es una bomba de gasolina");
                    break;
            
            case 3: System.out.println("La bomba es una bomba de hormigón");
                    break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            default: 
                System.out.println("No existe un valor válido para tipo de bomba");
            
                
        }        
                
    }
}