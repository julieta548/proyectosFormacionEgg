
package introjava.modulo2;

public class Ejercicio25 {

      public static void main(String[] args) {
     
          int [][] matriz = new int[4][4];
          int i,j;
          
          System.out.println("Matriz");
          for (i= 0; i<4; i++){
              for (j=0; j<4; j++){
                  matriz[i][j] = (int) (Math.random()*10+1);
                  
                  if (matriz [i][j] > 9){
                      System.out.print(matriz[i][j] + " ");
                  } else {
                      System.out.print(matriz[i][j] + "  ");
                  }
              }
              System.out.println("");
          }
          System.out.println(" ");
          
          System.out.println("Matriz traspuesta");
          for (i= 0; i<4; i++){
              for (j=0; j<4; j++){
                  if (matriz[j][i] > 9 ){
                      System.out.print(matriz[j][i] + " ");
                  } else {
                      System.out.print(matriz[j][i] + "  ");
                  }
              }
              System.out.println("");
          }
    
      }
    
}
