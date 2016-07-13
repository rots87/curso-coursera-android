public class EjemploArrays {
  public static void main(String[] args) {
    /*
    Arreglos de Una Dimension
    */
    int [] miArregloInt = new int[5]; //Indices del 0-4
    miArregloInt[2] = 5;
    System.out.println(miArregloInt[2]);
    /*
    Arreglos de Dos Domensiones
    */
    double[][] miArregloDouble2D = new double[3][3];
    miArregloDouble2D[1][1] = 5.6;
    System.out.println(miArregloDouble2D[1][1]);
    /*
    Arreglos de tres Domensiones
    */
    char[][][] miArregloChar3D = new char[3][3][3];
    miArregloChar3D[1][1][1] = 'F';
    System.out.println(miArregloChar3D[1][1][1]);
  }
}
