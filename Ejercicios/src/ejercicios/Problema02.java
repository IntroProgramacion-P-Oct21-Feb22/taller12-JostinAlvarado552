/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];

        for (int fila = 0; fila < datos1.length; fila++) {
            for (int columna = 0; columna < datos1[fila].length; columna++) {
                datos3[fila][columna] = obtenerSuma(datos1[fila][columna],
                        datos2[fila][columna]);

                System.out.printf("%s\n", datos3[fila][columna]);
            }
        }
    }
    public static double obtenerSuma(double datos1, double datos2) {
        if (datos1 == 0) {
            return datos2;
        } else {
            if (datos2 == 0) {
                return datos1;
            } else {
                return 1 + obtenerSuma(datos1, datos2 - 1);
            }
        }
    }
}
    
  
