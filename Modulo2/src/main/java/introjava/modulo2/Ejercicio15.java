
package introjava.modulo2;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2, opcion;
        boolean bool = false;
        String sn;
        
        System.out.println("Ingrese dos números enteros positivos");
        num1 = leer.nextInt();
        
        while (num1 < 0) {
            System.out.println("Número incorrecto, intente nuevamente");
            num1 = leer.nextInt();
        }
        
        num2 = leer.nextInt();
        
        while (num2 < 0 ){
             System.out.println("Número incorrecto, intente nuevamente");
             num2 = leer.nextInt();
        }
        
        do {
        System.out.println("Menú");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opción");
        
        
        opcion = leer.nextInt();
        
        
            switch (opcion) {
                case 1: double suma = num1 + num2;
                        System.out.println("SUMA: " + suma);
                        bool = true;
                    break;
                case 2: double resta = num2 - num1; 
                        System.out.println("RESTA: " + resta);
                        bool = true;
                    break;
                case 3: double mult = num1 * num2;
                        System.out.println("MULTIPLICACIÓN: " + mult);
                        bool = true;
                    break;
                case 4: double div = num1/num2;
                        System.out.println("DIVISIÓN: " + div);
                        bool = true;
                    break;
                case 5: System.out.println("¿Está seguro que desea salir del programa? S/N");
                        sn = leer.next();
                        sn = sn.toUpperCase();
                        String N = "N";
                        String S = "S";
                        
                        if (sn.equals(S) == true) {
                                bool = false;
                                break;
                            } else if (sn.equals(N) == true) {
                                bool = true;
                                break;
                            } else if (sn.equals(S) == false && sn.equals(N) == false){
                                do {
                                System.out.println("Incorrecto, intente nuevamente");
                                sn = leer.next();
                                
                                } while (sn.equalsIgnoreCase("S") == false && sn.equalsIgnoreCase("N") == false );
                                break;
                            }
            }
          
            Scanner enter = new Scanner(System.in);
            enter.nextLine();

        } while ((opcion < 0 || opcion > 5) || bool == true);
        
        
    }
}   
    
