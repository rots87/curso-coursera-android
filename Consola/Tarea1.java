public class Tarea1 {
  public static void main(String[] args) {
    //Declaracion de Variables
    int[][] matriz = new int[4][4];
    int n = 0;
    //Llenado de la matriz
    for (int i = 0; i < 4 ; i++ ) {
      for (int j = 0; j < 4 ; j++ ) {
        n += 2;
        matriz[i][j] = n;
      }
    }
    //Impresion de la matriz segun ejemplo
    int m = 1;
    for (int i = 0; i < 4 ; i++ ) {
      System.out.print(m++ + " ");
      for (int j = 0; j < 4 ; j++ ) {
        System.out.print(matriz[i][j]);
        System.out.print("\t");
      }
      System.out.println();
    }
  }
}
