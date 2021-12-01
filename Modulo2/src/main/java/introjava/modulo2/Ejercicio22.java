
package introjava.modulo2;



public class Ejercicio22 {

   
    public static void main(String[] args) {
  
      int [] vector = new int[100];
      int i, j;
      int cont = 100;
      
      for (i = 0; i < 100; i++) {
           
         vector[i] = cont;
         cont = cont - 1;
         System.out.print(vector[i] + " ");
      }
       
    }
    
}
